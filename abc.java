			} 
					else if(ln.getUtype().equalsIgnoreCase("PM")){
						rd=request.getRequestDispatcher("/PMOHome.jsp");
						rd.forward(request,response);
						ss = request.getSession();
					}
					else if(ln.getUtype().equalsIgnoreCase("RE")){
						rd=request.getRequestDispatcher("/ReviewHome.jsp");
						rd.forward(request,response);
						ss = request.getSession();
					}
					else if(ln.getUtype().equalsIgnoreCase("AE")){
						rd=request.getRequestDispatcher("/AuditorHome.jsp");
						rd.forward(request,response);
						ss = request.getSession();
					}
					else
					{		rd=request.getRequestDispatcher("/errorpage.jsp");
					        rd.forward(request,response);
					}
		
