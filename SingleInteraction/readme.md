# Basit Soket Programlama ile İstemci-Sunucu Uygulaması
Bu projede, Java dilini kullanarak basit bir istemci-sunucu iletişim uygulaması geliştirilmiştir. Bu uygulama, istemci ve sunucu arasında metin tabanlı veri alışverişi yapar.

## Sunucu (Server) Uygulaması
Sunucu uygulaması, istemcinin bağlanmasını bekler ve bağlantıyı kabul ettikten sonra istemcinin gönderdiği metin mesajlarını alır. Sunucu her bağlantıyı kabul ettiğinde, istemciye sunucunun o anki zamanını gönderir.

## Nasıl Çalışır?
- Sunucu, belirli bir bağlantı noktasında (port) başlatılır.
- Bir istemci bağlanmayı bekler.
- Bir istemci bağlandığında, sunucu bağlantıyı kabul eder ve istemciden gelen verileri alır.
- Sunucu, istemciden gelen verileri okur ve istemciye sunucunun o anki zamanını gönderir.
- Sunucu sürekli olarak yeni istemcileri kabul etmeye devam eder.

## İstemci (Client) Uygulaması
İstemci uygulaması, belirli bir sunucu adresine ve bağlantı noktasına bağlanarak sunucudan zaman bilgisi alır ve bu bilgiyi bir pop-up penceresinde görüntüler.

### Nasıl Çalışır?
- İstemci, belirli bir sunucu adresine ve bağlantı noktasına bağlanır.
- İstemci, sunucudan gelen zaman bilgisini alır.
- İstemci, aldığı zaman bilgisini bir pop-up penceresinde görüntüler.
- İstemci, sunucu tarafından kapatıldığında veya kendi tarafından kapatıldığında sonlanır.

## Nasıl Kullanılır?
- İlk olarak, sunucu uygulamasını başlatın. Sunucu, belirli bir bağlantı noktasında (örneğin, 5001) başlayacaktır.
- Ardından, istemci uygulamasını başlatın ve sunucu adresini (genellikle "localhost" veya "127.0.0.1") ve aynı bağlantı noktasını belirtin (örneğin, 5001).
- İstemci başladıktan sonra, sunucudan aldığı zaman bilgisini bir pop-up penceresinde görebilirsiniz.
- İstemci, sunucu tarafından kapatıldığında veya kendi tarafından kapatıldığında sonlanır.
