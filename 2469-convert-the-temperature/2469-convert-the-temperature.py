class Solution:
    def convertTemperature(self, celsius: float) -> List[float]:
        list = []
        list.append(celsius+273.15)
        list.append(celsius*1.80+32.00)
        return list