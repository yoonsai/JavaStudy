package com.sist.vo;

import java.io.Serializable;

/*
 * 1|즐겁고 신비한 여정으로의 초대! NiziU(니쥬) Korea 1st SINGLE ALBUM [Press Play]
 * |//image.genie.co.kr/Y/IMAGE/IMG_MUZICAT/IV2/Genie_Magazine/13704/Mgz_Main_Top_20231030173812.jpg/dims/resize/Q_80,0
 * |오디션 방송에서 시작해 무한한 가능성을 보여준 아홉 소녀들, NiziU(니쥬)가 한국 데뷔 싱글 [Press Play]로 본격적인 한국 활동에 시동을 걸었습니다. 사랑스러운 매력과 흥미진진한 스토리를 담은 트레일러 촬영 현장을 지금, 공개합니다!
 */
public class MagazineDetailVO implements Serializable{
	private int no;
	private String title;
	private String poster;
	private String subject;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
