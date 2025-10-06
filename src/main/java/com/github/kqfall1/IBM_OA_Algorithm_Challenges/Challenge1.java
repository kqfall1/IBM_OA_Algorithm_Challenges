// Quinn Keenan, 04/10/2025

package com.github.kqfall1.IBM_OA_Algorithm_Challenges;

import com.github.kqfall1.kqfall1JavaUtils.CollectionConverter;

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
		int[] descendingTransactions = new int[transactions.length];
		int descendingTransactionsIndex = 0;
		int transactionCount = 0;
		int transactionIndex;

		Arrays.sort(transactions);

		descendingTransactions = CollectionConverter.reverse(transactions);

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