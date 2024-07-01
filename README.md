-User là một class đại diện cho người dùng của ứng dụng chứa các thông tin như id, tên người dùng, eamil, mật khẩu và role, (trạng thái của tài khoản nếu có).

-UserDetails là một interface của Spring Security, cung cấp các phương thức để truy xuất thông tin người dùng, bao gồm id, tên người dùng, eamil, mật khẩu và role, (trạng thái của tài khoản nếu có).

-UserDetailsService là một interface của Spring Security, cung cấp phương thức duy nhất loadUserByUsername(username hoặc email) để truy xuất đối tượng UserDetails dựa trên tên hoặc email người dùng.

-PasswordEncoder cung cấp các phương thức mã hóa mật khẩu bao gồm encode (mã hóa mật khẩu) và matches (so sánh mật khẩu), ...., nhằm đảm bảo mật khẩu được lưu trữ trong cơ sở dữ liệu không bị lộ ra ngoài.

-AuthenticationProvider cung cấp cơ chế xác thực cho Spring Security. Nó xác thực đối tượng Authentication và trả về đối tượng Authentication đã được xác thực.

-SecurityContextHolder là một class cung cấp phương thức để truy xuất và lưu trữ SecurityContext. SecurityContext chứa thông tin chi tiết về bảo mật.
