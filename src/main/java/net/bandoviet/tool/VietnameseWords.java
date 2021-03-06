package net.bandoviet.tool;

/**
 * Tieng Viet khong dau (da loai nhung tu co trong tieng Anh, Phap nhu an, bien,..).
 * @author quocanh
 *
 */
public class VietnameseWords {
  public static String ACCENTS = "a,à,á,ả,ạ,ã,ă,ằ,ắ,ẳ,ặ,ẵ,â,ầ,ấ,ẩ,ậ,ẫ,-,_"
      + "A,À,Á,Ả,Ạ,Ã,Ă,Ằ,Ắ,Ẳ,Ặ,Ẵ,Â,Ầ,Ấ,Ẩ,Ậ,Ẫ,"
      + "o,ò,ó,ỏ,ọ,õ,ô,ồ,ố,ổ,ộ,ỗ,ơ,ờ,ớ,ở,ợ,ỡ,"
      + "O,Ò,Ó,Ỏ,Ọ,Õ,Ô,Ồ,Ố,Ổ,Ộ,Ỗ,Ơ,Ờ,Ớ,Ở,Ợ,Ỡ,"
      + "e,è,é,ẻ,ẹ,ẽ,ê,ề,ế,ể,ệ,ễ,"
      + "E,È,É,Ẻ,Ẹ,Ẽ,Ê,Ề,Ế,Ể,Ệ,Ễ,"
      + "u,ù,ú,ủ,ụ,ũ,ư,ừ,ứ,ử,ự,ữ,"
      + "U,Ù,Ú,Ủ,Ụ,Ũ,Ư,Ừ,Ứ,Ử,Ự,Ữ,"
      + "i,ì,í,ỉ,ị,ĩ,I,Ì,Í,Ỉ,Ị,Ĩ,"
      + "đ,Đ,y,ỳ,ý,ỷ,ỵ,ỹ,Y,Ỳ,Ý,Ỷ,Ỵ,Ỹ";
  public static String NOACCENTS = "a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a, , "
      + "A,A,A,A,A,A,A,A,A,A,A,A,A,A,A,A,A,A,"
      + "o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,"
      + "O,O,O,O,O,O,O,O,O,O,O,O,O,O,O,O,O,O,"
      + "e,e,e,e,e,e,e,e,e,e,e,e,"
      + "E,E,E,E,E,E,E,E,E,E,E,E,"
      + "u,u,u,u,u,u,u,u,u,u,u,u,"
      + "U,U,U,U,U,U,U,U,U,U,U,U,"
      + "i,i,i,i,i,i,I,I,I,I,I,I,"
      + "d,D,y,y,y,y,y,y,Y,Y,Y,Y,Y,Y";
  

  public static String[] AmericanNames = {
      "James", "Christopher", "Ronald", "Mary", "Lisa", "Michelle",
      "John", "Daniel", "Anthony", "Patricia", "Nancy", "Laura",
      "Robert", "Paul", "Kevin", "Linda", "Karen", "Sarah",
      "Michael", "Mark", "Jason", "Barbara", "Betty", "Kimberly",
      "William", "Donald", "Jeff", "Elizabeth", "Helen", "Deborah",
      "David", "George", "Jennifer", "Sandra",  
      "Richard", "Kenneth", "Maria", "Donna",
      "Charles", "Steven", "Susan", "Carol",
      "Joseph", "Edward", "Margaret", "Ruth",
      "Thomas", "Brian", "Dorothy", "Sharon"
  };
  
  public static String[] surnames = {"Nguyen", "Tran", "Pham", "Hoang", "Huynh", 
      "Phan", "Dang", "Bui", "Ngo", "Duong", "Chau", "Doan", "Giang", "Luong",
      "Phung", "Nghiem", "Quang", "Quynh", "Quyen", "Thao", "Thuy", "Trang", 
      "Trieu", "Trinh", "Vinh", "Vuong", "Bang", "Minh", "Dinh", "Quoc", "Vu", 
      "Do", "Ho", "Le", "Vo", "Ly", "An", "Anh", "Au", "Ba", "Bạc", "Bạch", "Bang",
      "Banh", "Bao", "Buu", "Be", "Bi", "Bien", "Binh", "Bo", "Ca", "Cai", "Cam",
      "Cao", "Cat", "Cam", "Can", "Che", "Chiem", "Chu", "Chau", "Chung", "Chuong",
      "Chu", "Co", "Cu", "Cung", "Cu", "Da", "Danh", "Diem", "Doan", "Du", "Diep",
      "Dam", "Dan", "Dao", "Dau", "Dien", "Dinh", "Doan", "Don", "Dong", "Dong",
      "Doi", "Dai", "Duong", "Gia", "Giao", "Giang", "Giap", "Ha", "Hang", "Han", "Hy",
      "Hin", "Hoa", "Hong", "Hung", "Hua", "Kha", "Khuong", "Khau", "Khuu", "Khoa", "Khong", 
      "Khu", "Khuat", "Khuc", "Kieu", "Kim", "La", "Lac", "Lai", "Lam", "Leu", "Lieu",
      "Lo", "Luc", "Lu", "Lo", "Lu", "La", "Luong", "Luu", "Ma", "Mac", "Mach", "Mai",
      "Mang", "Mau", "Man", "Moc", "Ninh", "Nham", "Nhiem", "Ngan", "Nghiem", "Nghi",
      "Nguy", "Nhu", "Nong", "Ong", "Phi", "Pho", "Phung", "Phuong", "Quan", "Quach",
      "Sam", "Son", "Su", "Ta", "Tao", "Tang", "Thach", "Thai", "Thao", "Than", "Thap",
      "Thi", "Thieu", "Thinh", "Thoi", "Tieu", "Tiep", "Tong", "To", "Ton", "Tong",
      "Trang", "Tra", "Trac", "Trieu", "Trinh", "Trung", "Truong", "Tu", "Ty", "Uong",
      "Ung", "Van", "Vi", "Vien", "Vuong", "Vu", "Xa", "Yen", "Ngoc"};
  
  // Dung de search ten tieng Viet  
  public static String RESTAU = " nguyen tran pham hoang huynh phan"
      + "dang bui ngo duong bien binh cao cat "
      + "che chiem chau chuong cung danh diem doan diep "
      + "dam dao dau dien dinh doan dong duong gia giao giang "
      + "giap hang han hinh hoa "
      + "khong luong "
      + "mach mang mau man moc ninh nham nhiem ngan nghiem "
      + "nghi nguy nhu nongphi pho phung phuong quan "
      + "thach thai thao than thap thi thieu thinh thoi tieu tiep "
      + "tong trang tra trieu trinh trung truong "
      + "vien yen ngoc "
      + "bang tuyet gia xuan bich thai nguyet thi diem hai hoan "
      + "linh loan minh diep chi hanh khanh lan hoang cuc cuong trang "
      + "dai quynh anh ngoc thuc truc thien kieu dung nghi chieu thu giang "
      + "hoai thanh thien thuy tra quynh ngan nhat viet dieu "
      + "hieu xuan mong bach phuong huong nha yen hop xuan huyen thanh thuy nhu "
      + "gia phi thien khue lien uyen nuong nguyet hoang suong kiet "
      + "trinh tuong tham thi thuong thu hoai tue tho thoa bach thuy dang "
      + "duy phuoc truong vinh duong quang quoc thieu thuan trung tuan "
      + "tuong tung hoai gia cong bang tieu bui buu thien khai huu manh hung "
      + "khac khai nhat phuc trong dien giap huy khuong hiep tuan tri "
      + "dinh nhat phuoc duc nhan hai ninh nam thien phu che sinh san "
      + "trong luong cong khac doanh kinh toc loc xanh tuoi khiem khoan "
      + "buom chim vui cham tram nhuong tien tuong kinh banh chon "
      + "khoai ";
  
  // Dung de search ten tieng Viet  
  public static String VOCABULARY1 = " nguyen tran pham hoang huynh phan vu "
      + "vo dang bui do ho ngo duong bien binh cao cat "
      + "che chiem chau chuong cung danh diem doan diep "
      + "dam dao dau dien dinh doan dong duong gia giao giang "
      + "giap ha hang han hy hinh hoa hung kha khuong khau khuu khoa "
      + "khong khu khuat khuc kieu lac lam lieu luong "
      + "mach mai mang mau man moc ninh nham nhiem ngan nghiem "
      + "nghi nguy nhu nong ong phi pho phung phuong quan "
      + "thach thai thao than thap thi thieu thinh thoi tieu tiep "
      + "trang tra trac trieu trinh trung truong "
      + "vien vuong yen ngoc "
      + "bang tuyet nhu bao gia xuan bich thai nguyet thi diem hai hoan "
      + "linh loan minh diep chi hanh khanh lan hoang cuc cuong trang "
      + "dai quynh anh ngoc thuc truc thien kieu dung nghi chieu thu giang "
      + "hoai thanh thien thuy tra quynh ngan nhat viet dieu "
      + "hieu xuan mong bach phuong huong nha yen hop xuan huyen thanh thuy nhu "
      + "gia phi thien khue lien uyen nuong nguyet hoang suong kiet "
      + "trinh tuong tham thi thuong thu hoai tue tho thoa bach thuy dang "
      + "duy phuoc truong vinh duong quang quoc thieu thuan trung tuan "
      + "tuong tung ho hoai gia cong bang tieu bui buu thien khai huu manh hung "
      + "khac khai nhat phuc trong dien giap huy ky khuong hiep ha tuan tri "
      + "dinh nhat phuoc duc nhan hai ninh nam thien phu che sinh san "
      + "trong luong cong khac doanh kinh toc loc xanh tuoi khiem khoan "
      + "buom chim vui cham tram nhuong tien tuong kinh banh chon "
      + "khoai khoac kho khe ";
      
  public static String VOCABULARY2 = " ach bech ang anh benh ao beo ap "
      + "bep beu bia bich biec biem bieng biet bieu bim binh bip biu banh "
      + "boi bao bom canh bu bua cao buc bui buoc buoi buom buon buong "
      + "buop buot cau buou bup cac cach cai cam chac chanh "
      + "chao chau chay che chuoc chuoi chuom chuon chuong chuot "
      + "chech chem chup chut chenh chuy chuyen cheo chep chet chi chia "
      + "chich chiec chiem chieng chiep chiet chieu chim chinh coc chiu cho "
      + "choa choac choai choan choang choat choe choet choi chom chon chong "
      + "chot chu chua chuan chuc chui cua cuc cui cun cung cuoc "
      + "cuoi cuom cuon cuong cuop cuu danh dao dac dach dai dat dau doa doai "
      + "doan doang doanh doi dech dem denh dep det deu di diec diem dien dieng "
      + "diep dua dinh duenh dui dum diu duoc duoi giai duom duon duong giam "
      + "gian duot dup dut duy duyen duyet giang ech gianh giao enh eo ep gac "
      + "gach giap giat giau giay ganh gao gie giec giem gien gieng gieo giep "
      + "giet gieu gim gio gau ghe gioc gioi ghech ghem ghen gion ghenh gheo "
      + "ghep giong ghi giop giot giu ghien ghim gia giua giuc giui gium giun "
      + "giuoc giuong giup giut goa goc goi giac gom goong hoam hoan gu guc gung "
      + "guoc guom hoang hoanh hoat hac hach hoen hoet hoi hom hon "
      + "huan huc huech huo huom huong huou hup huu huy huych huyen huyet huynh "
      + "huyt ia inh hanh iu ke hao kec kech kem keng hau kenh keo kep ket keu "
      + "kha hech khac henh heo khach khai hia hich hiem kham hien khang hieng "
      + "hiep khanh khao khap khau khay khe khec khem khen khenh kheo khep khet "
      + "kheu hieu khia khich khiem khien khieng khiep khieu khinh hinh khit khiu "
      + "kho khoa khoac khoai khoam hoa khoan khoang khoanh khoat khoay khoc khoe "
      + "khoeo khoet khoi khom khon khong hoac hoai khop khu khuynh khuyu ki khua "
      + "khuan khuat khuay khuc khue khuech khui khum khung khuo khuoc khuoi khuon "
      + "khuot khuou khuy khuya khuyen kia kich khuyet kiem kien kieng kiep kiet "
      + "lua kieu luan luat luc kinh lum lun luoc luoi luom luon luong lach "
      + "luot lup luu luy luyen mam mang manh lanh mao lau mau lech lem len lenh "
      + "mem lep meng menh meo meu lia mieng miet liec mieu liem mim minh lieng liep "
      + "liet linh moc mong loa loai loang mua loat loc loe loet muc mui lom "
      + "mun lon mung muoi muom muong muop muot muou mup muu nac nach nai nam nat "
      + "nau nem nen nang neo nep nga nanh nao ngac ngach ngai ngam nhieu nhim "
      + "nhin nhinh nhip nhiu ngan nho ngang nhoa nhoai nhoang nhoay nganh nhoc "
      + "ngao nhoe nhoen nhoet nhoi ngap nhom ngat nhon ngau ngay nhong nhop nhot "
      + "nhu nghe nhua nhuan nhuc nghech nghen nhui nghenh nhum nhun ngheo nhung "
      + "nghet ngheu nghi nghia nhuoc nghich nhuom nhuong nghiem nhut nhuy nhuyen "
      + "nia nich niem nghien nien nghieng nghiep nieng niet nghiet nieu nghim nghin "
      + "nin ninh niu nghit ngo ngoa ngoac noan ngoach ngoai noi ngoam ngoan ngoang "
      + "ngoanh ngoao ngoap ngoat ngoay ngoc ngoe ngoem ngoen ngoeo ngoet ngoi ngom "
      + "ngon ngong ngop ngot ngu nong nop nua nuc ngua nui num nung nguay nguc nuoc "
      + "ngui ngum ngun ngung nguoc nguoi nguon nguong nuoi nuom nuong ngup ngut nguu "
      + "nguy nuot nup nguyen oa oach nguyet nguyt nha oai oan oang oanh oe oi nha "
      + "nhac nhach nhai nham ong nhan op palang pao pha nhang phac phach phai nhanh "
      + "nhao pham nhap phan nhat nhau nhay nhe nhech nhem nhen nheo nhep nhet nhi "
      + "phang nhich nhiec phanh nhiem phao nhien phap nhiet phat phiet phieu phim "
      + "phin phinh phit phiu pho phau phay phe phoc phoi phech phen phenh pheo phep "
      + "phom phet pheu phong phia phich phiem phien phop sai phu san phua phuc phui "
      + "phun phung phuoc phuon phuong phuou sanh phuy pich sao quac quam quan "
      + "sem senh seo seu sia sieng siet sieu sim sinh quang siu quanh quao quap quat "
      + "quau quen soai soan queo quet queu soat quo quoc som quy quych quyen quyet "
      + "quynh sooc soong quyt rach sua suat sui ranh rao suoi suon rau suong suot sut "
      + "suu suy suyen suyt rech rem reo reu tach tai riem rieng riet rieu rinh "
      + "roat tam ron rong rop rua rui ruoc ruoi ruom ruon ruong ruot ruou rup "
      + "tanh tao sach tem tenh teo tep tet teu tha thac thach tham thang thanh thao "
      + "tay thuat thuc thue thui thum thun thung thuo thuoc thuoi thuon thuong thuot "
      + "thup thut thuy thap thuyen thuyet thau tia tich thay tiec tiem thech theo thep "
      + "thet theu thi tieng tiep tiet thia thich tieu thiec thiem thien thieng thiep "
      + "thiet thieu tinh thim thinh thip thit thiu tiu thoa thoai thoan thoang "
      + "thoat thoc thoi toa toac toai toan thom toang toat toay toet thop thot thu "
      + "tong thua thuan tra trach tranh trai trao trat trau tran tre trech trem tren "
      + "treo tret trang tria trich trien trieng triet trieu vam trinh trit triu tro troi "
      + "vang trom vanh trong vao vap vay ve tru vech vem ven venh trua veo truat veu "
      + "vi trui trum trun trung vich viec viem vien vieng viet vinh viu vo truoc truon "
      + "truong truot trup trut truy truyen voan voc voi vom vong vop vot vua vuc vui "
      + "vun vung vuoc vuon vuong tua tuan vuot tuat vut xa tuech tui tuoc tuoi xac tuom "
      + "tuon tuong xach xai xam xan xang xanh tuop tuot tuu xao tuy tuyen xap xat xau "
      + "xay tuyet tuyn tuyt ua xec uat xech uay uc xem xep ung "
      + "uoc xich xiec xiem xien uom uon xiet xieu uong uop uot uu "
      + "xinhuy xoa xoac xoai uych xoan xoang xoay vach xoc vai xoe xoet xoi "
      + "xom xon xong xup xut xuy xuya xuyen xuynh xuyt xot xua xuan xuat "
      + "xuc xue xui yem xum xung yeu xuoc xuoi xuom xuong ";
  
  public static String VOCABULARY = " ach bech ang anh ai beng benh ao beo ap "
      + "bep beu bia bich biec biem bieng biet bieu bim binh bip biu banh "
      + "boi bao bom boong canh bu bua cao buc bui buoc buoi buom buon buong "
      + "buop buot cau buou bup buyt cac cach cai cam chac chach chan chang chanh "
      + "chao chau chung chay che chuoc chuoi chuom chuon chuong chuop chuot "
      + "chech chem chen chup chut chenh chuy chuyen cheo chep chet chi chia "
      + "chich chiec chiem chieng chiep chiet chieu chim chinh coc chiu cho "
      + "choa choac choai choan choang choat choe choet choi chom chon chong "
      + "choong chot chu chua chuan chuc chui cua chun cuc cui cun cung cuoc "
      + "cuoi cuom cuon cuong cuop cuu danh dao dac dach dai dat dau doa doai "
      + "doan doang doanh doi dech dem denh dep det deu di diec diem dien dieng "
      + "diep dua dinh duenh dui dum diu duoc duoi giai duom duon duong giam "
      + "gian duot dup dut duy duyen duyet giang ech gianh giao enh eo ep gac "
      + "gach giap giat giau giay ganh gao gie giec giem gien gieng gieo giep "
      + "giet gieu gim gio gau ghe gioc gioi ghech ghem ghen gion ghenh gheo "
      + "ghep giong ghi giop giot giu ghien ghim gia giua giuc giui gium giun "
      + "giuoc giuong giup giut goa goc goi giac gom goong hoam hoan gu guc gung "
      + "guoc guom guong hoang hoanh hoat hac hach hoen hoet hoi hom hon hu hua "
      + "huan huc huech huo huom huong huou hup huu huy huych huyen huyet huynh "
      + "huyt ia inh hanh iu ke hao kec kech kem keng hau kenh keo kep ket keu "
      + "kha hech khac henh heo khach khai hia hich hiem kham hien khang hieng "
      + "hiep khanh khao khap khau khay khe khec khem khen khenh kheo khep khet "
      + "kheu hieu khia khich khiem khien khieng khiep khieu khinh hinh khit khiu "
      + "kho khoa khoac khoai khoam hoa khoan khoang khoanh khoat khoay khoc khoe "
      + "khoeo khoet khoi khom khon khong hoac hoai khop khu khuynh khuyu ki khua "
      + "khuan khuat khuay khuc khue khuech khui khum khung khuo khuoc khuoi khuon "
      + "khuot khuou khuy khuya khuyen kia kich khuyet kiem kien kieng kiep kiet "
      + "lua kieu kim luan luat luc kinh lum lun luoc luoi luom luon luong lach "
      + "luot lup luu luy luyen mam mang manh lanh mao lau mau lech lem len lenh "
      + "mem lep meng menh meo meu lia mieng miet liec mieu liem mim minh lieng liep "
      + "liet linh moc mong loa loai loang mua loat loc loe loet muc mui lom "
      + "mun lon mung muoi muom muong muop muot muou mup muu nac nach nai nam nat "
      + "nau nan nem nen nang neo nep nga nanh nao ngac ngach ngai ngam nhieu nhim "
      + "nhin nhinh nhip nhiu ngan nho ngang nhoa nhoai nhoang nhoay nganh nhoc "
      + "ngao nhoe nhoen nhoet nhoi ngap nhom ngat nhon ngau ngay nhong nhop nhot "
      + "nhu nghe nhua nhuan nhuc nghech nghen nhui nghenh nhum nhun ngheo nhung "
      + "nghet ngheu nghi nghia nhuoc nghich nhuom nhuong nghiem nhut nhuy nhuyen "
      + "nia nich niem nghien nien nghieng nghiep nieng niet nghiet nieu nghim nghin "
      + "nin ninh niu nghit ngo ngoa ngoac noan ngoach ngoai noi ngoam ngoan ngoang "
      + "ngoanh ngoao ngoap ngoat ngoay ngoc ngoe ngoem ngoen ngoeo ngoet ngoi ngom "
      + "ngon ngong ngop ngot ngu nong nop nua nuc ngua nui num nung nguay nguc nuoc "
      + "ngui ngum ngun ngung nguoc nguoi nguon nguong nuoi nuom nuong ngup ngut nguu "
      + "nguy nuot nup nguyen oa oach nguyet nguyt nha oai oan oang oanh oe oi nha "
      + "nhac nhach nhai nham ong nhan op palang pao pha nhang phac phach phai nhanh "
      + "nhao pham nhap phan nhat nhau nhay nhe nhech nhem nhen nheo nhep nhet nhi "
      + "phang nhich nhiec phanh nhiem phao nhien phap nhiet phat phiet phieu phim "
      + "phin phinh phit phiu pho phau phay phe phoc phoi phech phen phenh pheo phep "
      + "phom phet pheu phong phia phich phiem phien phop sai phu san phua phuc phui "
      + "phun phung phuoc phuon phuong phuou sanh phuy pich sao quac quach quam quan "
      + "sem senh seo seu sia sieng siet sieu sim sinh quang siu quanh quao quap quat "
      + "quau quen soai soan queo quet queu soat quo quoc som quy quych quyen quyet "
      + "quynh sooc soong quyt rach sua suat sui ranh rao suoi suon rau suong suot sut "
      + "suu suy suyen suyt rech rem reo reu tach tai riem rieng riet rieu rin rinh "
      + "riu ro roat tam ron rong rop rua rui ruoc ruoi ruom ruon ruong ruot ruou rup "
      + "tanh tao sach tem tenh teo tep tet teu tha thac thach tham thang thanh thao "
      + "tay thuat thuc thue thui thum thun thung thuo thuoc thuoi thuon thuong thuot "
      + "thup thut thuy thap thuyen thuyet thau tia tich thay tiec tiem thech theo thep "
      + "thet theu thi tieng tiep tiet thia thich tieu thiec thiem thien thieng thiep "
      + "thiet tim thieu tinh thim thinh thip thit thiu tiu thoa thoai thoan thoang "
      + "thoat thoc thoi toa toac toai toan thom toang toat toay toet thop thot thu "
      + "tong thua thuan tra trach tranh trai trao trat trau tran tre trech trem tren "
      + "treo tret trang tria trich trien trieng triet trieu vam trinh trit triu tro troi "
      + "vang trom vanh trong vao vap vay ve tru vech vem ven venh trua veo truat veu "
      + "vi trui trum trun trung vich viec viem vien vieng viet vinh viu vo truoc truon "
      + "truong truot trup trut truy truyen voan voc voi vom vong vop vot vua vuc vui "
      + "vun vung vuoc vuon vuong tua tuan vuot tuat vut xa tuech tui tuoc tuoi xac tuom "
      + "tuon tuong xach xai xam xan xang xanh tuop tuot tuu xao tuy tuyen xap xat xau "
      + "xay tuyet tuyn tuyt ua xec uat xech uay uc xem ui xen xeng xeo xep ung xet xeu "
      + "xia uo uoc xich xiec xiem xien uom xieng uon xiet xieu xim xin uong uop uot uu "
      + "xinh xit xiu xo uy xoa xoac xoai uych xoan xoang xoay vach xoc vai xoe xoet xoi "
      + "xom xon xong xup xut xuy xuya xuyen xuynh xoong xuyt xop xot xu xua xuan xuat "
      + "xuay xuc xue xui yem xum xung yeng yeu xuoc xuoi xuom xuong ";

  /**
   * Remove accents for a Vietnamese string.
   */
  public static String removeAccents(String str) {
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < str.length(); i++) {
      int idx = VietnameseWords.ACCENTS.indexOf(str.charAt(i));
      if (idx >= 0) {
        result.append(NOACCENTS.charAt(idx));
      } else {
        result.append(str.charAt(i));
      }
    }
    return result.toString();
  }
  /**
   * Check whether a person's name is Vietnamese.
   */
  public static boolean isVietnamese(String name) {
    name = VietnameseWords.removeAccents(name).toLowerCase();
    
    if (isTwoVietnamese(name)) return true;
    
    
    String[] words = name.trim().split(" ");
    for (int i = 0; i < words.length; i++) {
      String word = " " + words[i] + " "; 
      
      for (int j = 0; j < VietnameseWords.surnames.length; j ++ ) {
        if (word.equalsIgnoreCase(" " + VietnameseWords.surnames[j] + " ")) 
          return true;
      }
    }
    return false;
  }
  
  public static boolean isTwoVietnamese(String name) {
    name = VietnameseWords.removeAccents(name).toLowerCase();
    int count = 0;
    String[] words = name.trim().split(" ");
    for (int i = 0; i < words.length; i++) {
      String word = words[i]; 
      if (VietnameseWords.VOCABULARY.contains(" " + word + " ")) {
        count ++;
      }
    }
    return count > 1;
  }
}
