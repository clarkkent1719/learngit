package com.cfcc.itfe.webservice;

import java.util.List;

import com.cfcc.itfe.dto.ApplyResultDto;
import com.cfcc.itfe.frame.DataApplyFrame;

public class ProcessThread extends Thread {
	private ApplyResultDto applyResultDto ;
		private DataApplyFrame daf =null;
			public void run() {
					WebServiceImpl wsi = new WebServiceImpl();
							List<ApplyResultDto> reslist = wsi.getDataFromWebService(applyResultDto);
									daf.setResultlist(reslist);
											daf.fillTable(reslist);
												}
													
														public ApplyResultDto getApplyResultDto() {
																return applyResultDto;
																	}

																		public void setApplyResultDto(ApplyResultDto applyResultDto) {
																				this.applyResultDto = applyResultDto;
																					}

																						public DataApplyFrame getDaf() {
																								return daf;
																									}

																										public void setDaf(DataApplyFrame daf) {
																												this.daf = daf;
																													}
																													}
