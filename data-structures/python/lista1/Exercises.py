import random


def main():
    print('Welcome!')

    arr = [random.randint(-100, 1000) for i in range(100)]

    choice = int(input(
        '''
        1. interval average (100, 1000)
        2. general average
        3. sum negative numbers
        
        '''))

    if choice == 1:
        print(f'Average: {interval_average(arr)}')
    elif choice == 2:
        print(f'Averrage: {general_average(arr)}')
    else:
        print(f'Sum negative numbers: {sum_negative_numbers(arr)}')


def interval_average(arr: list) -> float:
    '''Média de um intevalo

    Args:
        arr (list): a lista para apurar a média

    Returns:
        A média dos números entre 100 e 1000

    '''
    average = 0
    count = 0
    for num in arr:
        if num in range(100, 1000):
            average += num
            count += 1
    return (average / count)


def general_average(arr: list) -> float:
    '''Média geral

    Args:
        arr (list): a lista para apurar a média

    Returns:
        A média dos números contidos na lista
    '''
    average = sum(arr) / len(arr)
    return average


def sum_negative_numbers(arr: list) -> float:
    '''Soma dos números negativos

    Args:
        arr (list): a lista para apurar a soma

    Returns:
        A soma dos números negativos contidos na lista

    '''
    result = 0
    for num in arr:
        if num < 0:
            result += num
    return result


if __name__ == '__main__':
    main()
