package bai13;

public class CongNhan {
	private String mHo;
	private String mTen;
	private int mSoSP;

	public CongNhan(String mHo, String mTen, int mSoSP) {
		setmHo(mHo);
		setmTen(mTen);
		setmSoSP(mSoSP);
	}

	public CongNhan() {
		this.mHo = "chưa xác định";
		this.mTen = "chưa xác định";
		this.mSoSP = 0;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		if (mHo.trim().equals("")) {
			this.mHo = "chưa xác định";
		} else {
			this.mHo = mHo;
		}
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		if (mTen.trim().equals("")) {
			this.mTen = "chưa xác định";
		} else {
			this.mTen = mTen;
		}
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		if(mSoSP < 0) {
			this.mSoSP = 0;
		}else {
			this.mSoSP = mSoSP;
		}
	}

	public double tinhLuong() {
		if (mSoSP < 200) {
			return mSoSP * 0.5;
		} else if (mSoSP < 400) {
			return mSoSP * 0.55;
		} else if (mSoSP < 600)
			return mSoSP * 0.6;
		else {
			return mSoSP * 0.65;
		}
	}

	public String toString() {
		return String.format("%-15s%-10s%-20s%-10f", mHo, mTen, mSoSP, tinhLuong());
	}

}
