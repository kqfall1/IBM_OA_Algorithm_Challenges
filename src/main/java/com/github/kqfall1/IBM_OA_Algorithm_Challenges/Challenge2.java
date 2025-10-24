// Quinn Keenan, 04/10/2025

package com.github.kqfall1.IBM_OA_Algorithm_Challenges;

import com.github.kqfall1.utils.CollectionConverter;
import java.util.ArrayList;
import java.util.Arrays;

public class Challenge2
{
	/*
		Given an array of integers (representing the memory capacities of computer systems),
		return a subset of the array such that the subset contains no duplicate values and has the
		maximum possible number of indices. This must be done only by rearranging the order of the
		capacity values and by either adding one or subtracting one (once) from each value.
		Applying any other change to the capacity array is forbidden. All values in the subset must
		be non-negative.
	 */

	/* A "greedy" sorting algorithm that determines a subset that contains no duplicate or
	negative values by merely incrementing or decrementing each value in the array: */
	static int[] getMaxUniqueCapacities(int[] capacities)
	{
		ArrayList<Integer> capacitySubset = new ArrayList<>();
		int potentialCapacityValue;

		Arrays.sort(capacities);

		for (int capacity : capacities)
		{
			potentialCapacityValue = capacity - 1;

			//I violate the DRY principle here. Sue me! If Java supported sub-methods, I would write one.
			if (potentialCapacityValue <= 0 || capacitySubset.contains(potentialCapacityValue))
			{
				potentialCapacityValue = capacity;

				if (potentialCapacityValue <= 0 || capacitySubset.contains(potentialCapacityValue))
				{
					potentialCapacityValue = capacity + 1;

					if (potentialCapacityValue <= 0 || capacitySubset.contains(potentialCapacityValue))
					{
						continue;
					}
				}
			}

			capacitySubset.add(potentialCapacityValue);
		}

		return CollectionConverter.toIntArr(capacitySubset.toArray()); //CollectionConverter.toIntArr(capacitySubset);
	}
}