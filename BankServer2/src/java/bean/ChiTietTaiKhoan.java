/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ChiTietTaiKhoan implements Serializable {
	private long id;
	private String NgayGiaoDich;
	private long SoTienGiaoDich;
	private String SoTaiKhoan;
	private String GhiChu;
	
	
	public ChiTietTaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ChiTietTaiKhoan(long id, String ngayGiaoDich, long soTienGiaoDich, String soTaiKhoan, String ghiChu) {
		super();
		this.id = id;
		NgayGiaoDich = ngayGiaoDich;
		SoTienGiaoDich = soTienGiaoDich;
		SoTaiKhoan = soTaiKhoan;
		GhiChu = ghiChu;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNgayGiaoDich() {
		return NgayGiaoDich;
	}


	public void setNgayGiaoDich(String ngayGiaoDich) {
		NgayGiaoDich = ngayGiaoDich;
	}


	public long getSoTienGiaoDich() {
		return SoTienGiaoDich;
	}


	public void setSoTienGiaoDich(long soTienGiaoDich) {
		SoTienGiaoDich = soTienGiaoDich;
	}


	public String getSoTaiKhoan() {
		return SoTaiKhoan;
	}


	public void setSoTaiKhoan(String soTaiKhoan) {
		SoTaiKhoan = soTaiKhoan;
	}


	public String getGhiChu() {
		return GhiChu;
	}


	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
}
