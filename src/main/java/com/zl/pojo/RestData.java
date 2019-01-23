package com.zl.pojo;

public class RestData {
/**
 * 返回信息
 **/
		private String right="No";
		private String error;
		public String getRight() {
			return right;
		}
		public void setRight(String right) {
			this.right = right;
		}
		public String getError() {
			return error;
		}
		public void setError(String error) {
			this.error = error;
		}
		@Override
		public String toString() {
			return "RestData [right=" + right + ", error=" + error + "]";
		}
		
}
