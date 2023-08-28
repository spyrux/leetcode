class MyStack(object):

    def __init__(self):
        self.queue = []
        

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        self.queue.append(x)
        

    def pop(self):
        """
        :rtype: int
        """
        return self.queue.pop(len(self.queue)-1)
        

    def top(self):
        """
        :rtype: int
        """
        return self.queue[len(self.queue)-1]

    def empty(self):
        """
        :rtype: bool
        """
        if len(self.queue) == 0:
            return True
        else:
            return False


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()