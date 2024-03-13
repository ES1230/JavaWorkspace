package com.kh.chap01_list.part01_arrayList.model.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MusicTitleAscendingCompartor implements Comparator<Music> {
	
	//제목기준 오름차순
	@Override
	public int compare(Music o1, Music o2) {
	
		return o1.getTitle().compareTo(o2.getTitle());
	
		
		//----------------------------------------------------------
		
	
	}

}
