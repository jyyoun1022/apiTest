package org.codej.rest.algorithm.클래스.board.service;

import java.util.List;

import org.codej.rest.algorithm.클래스.board.dto.BoardDto;
import org.codej.rest.algorithm.클래스.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service //서비스임을 선언
public class BoardService{

	@Autowired //Mapper와 연결
	private BoardMapper boardMapper;

	public List<BoardDto> selectBoardList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BoardService::"+boardMapper);
		List<BoardDto> boardDtos = (List<BoardDto>) boardMapper.selectBoardList();
		return boardMapper.selectBoardList();
	}

	public int select() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BoardService::"+boardMapper);
		return boardMapper.select();
	}

	public void insertBoard(BoardDto board) throws Exception {
		// TODO Auto-generated method stub
		boardMapper.insertBoard(board);
	}
}