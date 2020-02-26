# Telefon Rehberi

Çift bağlı liste (doubly linked list) veri yapısı kullanımına dayanan ve isme göre alfabetik sıralı bir telefon rehberi uygulaması geliştirilişmişr. Uygulama görsel bir arayüze de sahiptir.

Rehberde kişilerin adı ve soyadları ile telefon numaraları yer almaktadır. Kişinin birden fazla telefon numarası olabilir, bu nedenle kişinin telefon numaraları bir “ArrayList” içinde saklanmaktadır.

Kişilerin bilgileri Bilgi isimli bir sınıf içinde tanımlanmıştır. Bu doğrultuda, listeye ilişkin düğüm (Node) sınıfında çift bağlı liste için gerekli bağ sahaları yanı sıra Bilgi sınıfı tipinde bir değişken tanımı da yapılmıştır.

Çift bağlı liste sınıfında, çift bağlı liste kullanmanın olası avantajlarından yararlanabilmek için listenin başını (head) ve sonunu (tail) temsil eden 2 değişken tanımlanmıştır.

'rehber.txt' isimli metin dosyasından okuma yapılarak çift bağlı liste bellekte oluşturulmaktadır. (Veriler virgül ile ayrılmıştır.)
NOT-1: Rehber isme göre alfabetik sıralı oluşturulacak olup, aynı isimde diğer bir kişi geldiğinde soyada göre alfabetik sıralı olacak şekilde eklenmektedir.

Kişileri rehberden silme, A’dan Z’ye veya Z’den A’ya sıralama, rehberden kişi arama fonksiyonları mevcuttur.

