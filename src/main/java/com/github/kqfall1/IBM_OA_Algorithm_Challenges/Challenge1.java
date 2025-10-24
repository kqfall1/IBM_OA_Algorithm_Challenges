// Quinn Keenan, 04/10/2025

package com.github.kqfall1.IBM_OA_Algorithm_Challenges;

import static com.github.kqfall1.utils.CollectionConverter.*;
import java.util.Arrays;

public class Challenge1
{
	/*
		Given an array of integers representing transactions (that may be gains or losses), return
		the maximum number of transactions that can be totalled to represent the balance of the
		transaction array with the balance remaining positive.
	 */

	/* A "greedy" addition algorithm that yields the maximum number of transactions without the
	balance ever becoming non-positive: */
	static int getMaxTransactions(int[] transactions)
	{
		int balance = 0;
		int[] descendingTransactions;
		int transactionCount = 0;

		Arrays.sort(transactions);
		descendingTransactions = toIntArr(reverse(toIntegerArr(transactions)));

		for (int transaction : descendingTransactions)
		{
			if (balance + transaction > 0)
			{
				balance += transaction;
				transactionCount++;
				continue;
			}

			break;
		}

		return transactionCount;
	}
}