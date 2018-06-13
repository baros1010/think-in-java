/*****************************************************************************/
/*      (C) Copyright IBM Japan 2017 All rights reserved                     */
/*****************************************************************************/
/*****************************************************************************/
/*                                                                           */
/* System Name       : Tsubasa Fintech 共通基盤                                                                                                  */
/* File Name         : AplCnvUtil.java                                       */
/* Generate          : AplCnvUtil.class                                      */
/* Compiler          : IBMJDK 1.8.0                                          */
/* Description       : 項目変換・フォーマットのユーティリティクラス共通処理クラス                                               */
/*****************************************************************************/
/* Modification History                                                      */
/*                                                                           */
/* Date        Name         Reason for change                                */
/* ----------  -----------  ------------------------------------------------ */
/* 2017/10/23  Z.Du         Initial code drop.                               */
/*****************************************************************************/

package usefulcoding;

/**
 * 項目変換・フォーマットのユーティリティクラス
 */
public final class AplCnvUtil {
		
	/**
	 * 必要に応じて後ろに特定文字を埋める
	 * 
	 * @param str null指定不可
	 * @param paddingChar 特定文字
	 * @param paddingLength この文字長になるように特定文字を埋める
	 * @return 結果文字列
	 */
	public static String paddingCharR(String str, char paddingChar, int paddingLength) {
		if (str == null) {
			return null;
		}
		int nlen = paddingLength - str.length();
		if (nlen <= 0) {
			return str;
		}
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < nlen; i++) {
			sb.append(paddingChar);
		}
		return sb.toString();
	}
	
	/**
	 * 必要に応じて先頭に特定文字を埋める
	 * 
	 * @param str null指定不可
	 * @param paddingChar 特定文字
	 * @param paddingLength この文字長になるように特定文字を埋める
	 * @return 結果文字列
	 */
	public static String paddingChar(String str, char paddingChar, int paddingLength) {
		if (str == null) {
			return null;
		}
		String strRes = "";
		int nlen = paddingLength - str.length();
		for (int i = 0; i < nlen; i++) {
			strRes += paddingChar;
		}
		return strRes + str;
	}
	
	/**
	 * 文字列の先頭と後ろのゼロを取り除く
	 * 
	 * @param str 全ゼロ/空文字/nullの場合、0を返す
	 * @return 結果文字列
	 */
	public static String trimZero(String str) {
		if (str == null || str.length() == 0) {
			return "0";
		}
		int nlen = str.length();
		int nbegin = 0;
		for (; nbegin < nlen; nbegin++) {
			if (str.charAt(nbegin) != '0') {
				break;
			}
		}
		String retVal = str.substring(nbegin, nlen);
		if (retVal.trim().length() == 0) {
			return "0";
		}
		return retVal;
	}
	
	/**
	 * 文字列の後ろの全角・半角スペースを取り除く
	 * 
	 * @param str nullの場合、空文字列を返す
	 * @return 結果文字列
	 */
	public static String trimSpaceR(String str) {
		if (null == str) {
			return "";
		}
		String buff = "";
		int nend = 0;
		for (nend = str.length() - 1; nend >= 0; nend--) {
			if (str.charAt(nend) != ' ' && str.charAt(nend) != '　') {
				break;
			}
		}
		if (0 <= nend) {
			buff = str.substring(0, nend + 1);
		}
		return buff;
	}
	
	/**
	 * 文字列の先頭と後ろの全角・半角スペースを取り除く
	 * 
	 * @param str nullの場合、空文字列を返す
	 * @return 結果文字列
	 */
	public static String trimSpace(String str) {
		if (null == str) {
			return "";
		}
		int nlen = str.length();
		int nbegin = 0;
		int nend = 0;
		for (nbegin = 0; nbegin < nlen; nbegin++) {
			if (str.charAt(nbegin) != ' ' && str.charAt(nbegin) != '　') {
				break;
			}
		}
		for (nend = nlen - 1; nend >= 0; nend--) {
			if (str.charAt(nbegin) != ' ' && str.charAt(nbegin) != '　') {
				break;
			}
		}
		if (nbegin == 0 && nend == nlen - 1) {
			return str;
		}
		String buff = "";
		if (nbegin <= nend) {
			buff = str.substring(nbegin, nend + 1);
		}
		return buff;
	}
}
