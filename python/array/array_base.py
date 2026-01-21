def get_element(nums: list[int], index: int) -> int:
    """获取数组中指定下表的元素值"""
    if index < 0 or index >= len(nums):
        raise IndexError(f"数组下标{index}越界[0,{len(nums)-1}]")
    else:
        return nums[index]


def find_element(nums: list[int], target: int) -> int:
    """查找数组中指定元素值"""
    for i in range(len(nums)):
        if nums[i] == target:
            return i
    return -1


def insert_element(nums: list[int], index: int, value: int) -> None:
    """在数组指定位置插入元素"""
    if index < 0 or index > len(nums):
        raise IndexError(f"数组下标{index}越界[0,{len(nums)}]")
    else:
        nums.append(0)
        for i in range(len(nums) - 1, index, -1):
            nums[i] = nums[i - 1]
        nums[index] = value


def change_element(nums: list[int], index: int, value: int) -> None:
    """修改数组中指定位置的元素值"""
    if index < 0 or index >= len(nums):
        raise IndexError(f"数组下标{index}越界[0,{len(nums)-1}]")
    else:
        nums[index] = value


if __name__ == "__main__":
    nums = [1, 2, 3, 4, 5]
    print(get_element(nums, 2))
    print(find_element(nums, 3))
    print(find_element(nums, 6))
    insert_element(nums, 2, 6)
    print(nums)
