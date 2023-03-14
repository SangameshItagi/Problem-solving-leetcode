class Solution:
    def trap(self, height: List[int]) -> int:
        stack = []
        area = 0
        n = len(height)
        for i in range(n):
            while stack and height[i]>height[stack[-1]]:
                stackHt = stack.pop()
                if stack:
                    w = i-stack[-1]-1
                    area=area+w*(min(height[stack[-1]], height[i])-height[stackHt])
            stack.append(i)
        return area
            