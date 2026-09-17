package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzceg extends com.google.android.gms.internal.ads.zzfz implements com.google.android.gms.internal.ads.zzhc {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.concurrent.atomic.AtomicReference zzb = null;
    private final javax.net.ssl.SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzhb zzg;
    private com.google.android.gms.internal.ads.zzgm zzh;
    private java.net.HttpURLConnection zzi;
    private java.io.InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final java.util.Set zzr;

    static {
            java.lang.String r0 = "^bytes (\\d+)-(\\d+)/(\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzceg.zza = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.google.android.gms.internal.ads.zzceg.zzb = r0
            return
    }

    zzceg(java.lang.String r2, com.google.android.gms.internal.ads.zzhh r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzcef r0 = new com.google.android.gms.internal.ads.zzcef
            r0.<init>(r1)
            r1.zzc = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zzr = r0
            com.google.android.gms.internal.ads.zzdi.zzc(r2)
            r1.zzf = r2
            com.google.android.gms.internal.ads.zzhb r2 = new com.google.android.gms.internal.ads.zzhb
            r2.<init>()
            r1.zzg = r2
            r1.zzd = r4
            r1.zze = r5
            r1.zzq = r6
            if (r3 == 0) goto L29
            r1.zzf(r3)
        L29:
            return
    }

    static /* bridge */ /* synthetic */ int zzk(com.google.android.gms.internal.ads.zzceg r0) {
            int r0 = r0.zzq
            return r0
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzceg r0, java.net.Socket r1) {
            java.util.Set r0 = r0.zzr
            r0.add(r1)
            return
    }

    private final void zzn() {
            r2 = this;
            java.net.HttpURLConnection r0 = r2.zzi
            if (r0 == 0) goto L11
            r0.disconnect()     // Catch: java.lang.Exception -> L8
            goto Le
        L8:
            r0 = move-exception
            java.lang.String r1 = "Unexpected error while disconnecting"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        Le:
            r0 = 0
            r2.zzi = r0
        L11:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r9, int r10, int r11) throws com.google.android.gms.internal.ads.zzgy {
            r8 = this;
            long r0 = r8.zzo     // Catch: java.io.IOException -> L8e
            long r2 = r8.zzm     // Catch: java.io.IOException -> L8e
            r4 = 0
            r5 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Lb
            goto L53
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.zzceg.zzb     // Catch: java.io.IOException -> L8e
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch: java.io.IOException -> L8e
            byte[] r0 = (byte[]) r0     // Catch: java.io.IOException -> L8e
            if (r0 != 0) goto L1a
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L8e
        L1a:
            long r1 = r8.zzo     // Catch: java.io.IOException -> L8e
            long r6 = r8.zzm     // Catch: java.io.IOException -> L8e
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L4e
            int r3 = r0.length     // Catch: java.io.IOException -> L8e
            long r6 = r6 - r1
            long r1 = (long) r3     // Catch: java.io.IOException -> L8e
            long r1 = java.lang.Math.min(r6, r1)     // Catch: java.io.IOException -> L8e
            int r2 = (int) r1     // Catch: java.io.IOException -> L8e
            java.io.InputStream r1 = r8.zzj     // Catch: java.io.IOException -> L8e
            int r1 = r1.read(r0, r4, r2)     // Catch: java.io.IOException -> L8e
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L8e
            if (r2 != 0) goto L48
            if (r1 == r5) goto L42
            long r2 = r8.zzo     // Catch: java.io.IOException -> L8e
            long r6 = (long) r1     // Catch: java.io.IOException -> L8e
            long r2 = r2 + r6
            r8.zzo = r2     // Catch: java.io.IOException -> L8e
            r8.zzg(r1)     // Catch: java.io.IOException -> L8e
            goto L1a
        L42:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L48:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L4e:
            java.util.concurrent.atomic.AtomicReference r1 = com.google.android.gms.internal.ads.zzceg.zzb     // Catch: java.io.IOException -> L8e
            r1.set(r0)     // Catch: java.io.IOException -> L8e
        L53:
            if (r11 != 0) goto L56
            goto L8d
        L56:
            long r0 = r8.zzn     // Catch: java.io.IOException -> L8e
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L6f
            long r6 = r8.zzp     // Catch: java.io.IOException -> L8e
            long r0 = r0 - r6
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L69
        L67:
            r4 = -1
            goto L8d
        L69:
            long r6 = (long) r11     // Catch: java.io.IOException -> L8e
            long r0 = java.lang.Math.min(r6, r0)     // Catch: java.io.IOException -> L8e
            int r11 = (int) r0     // Catch: java.io.IOException -> L8e
        L6f:
            java.io.InputStream r0 = r8.zzj     // Catch: java.io.IOException -> L8e
            int r4 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> L8e
            if (r4 != r5) goto L84
            long r9 = r8.zzn     // Catch: java.io.IOException -> L8e
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 != 0) goto L7e
            goto L67
        L7e:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L8e
            r9.<init>()     // Catch: java.io.IOException -> L8e
            throw r9     // Catch: java.io.IOException -> L8e
        L84:
            long r9 = r8.zzp     // Catch: java.io.IOException -> L8e
            long r0 = (long) r4     // Catch: java.io.IOException -> L8e
            long r9 = r9 + r0
            r8.zzp = r9     // Catch: java.io.IOException -> L8e
            r8.zzg(r4)     // Catch: java.io.IOException -> L8e
        L8d:
            return r4
        L8e:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzgy r10 = new com.google.android.gms.internal.ads.zzgy
            com.google.android.gms.internal.ads.zzgm r11 = r8.zzh
            r0 = 2000(0x7d0, float:2.803E-42)
            r1 = 2
            r10.<init>(r9, r11, r0, r1)
            throw r10
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r21) throws com.google.android.gms.internal.ads.zzgy {
            r20 = this;
            r1 = r20
            r7 = r21
            java.lang.String r2 = "Unable to connect to "
            r1.zzh = r7
            r3 = 0
            r1.zzp = r3
            r1.zzo = r3
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L290
            android.net.Uri r5 = r7.zza     // Catch: java.io.IOException -> L290
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L290
            r0.<init>(r5)     // Catch: java.io.IOException -> L290
            long r5 = r7.zze     // Catch: java.io.IOException -> L290
            long r8 = r7.zzf     // Catch: java.io.IOException -> L290
            r10 = 1
            boolean r11 = r7.zzb(r10)     // Catch: java.io.IOException -> L290
            r13 = 0
        L23:
            int r14 = r13 + 1
            r15 = 20
            if (r13 > r15) goto L279
            java.net.URLConnection r13 = r0.openConnection()     // Catch: java.io.IOException -> L290
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch: java.io.IOException -> L290
            boolean r15 = r13 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.io.IOException -> L290
            if (r15 == 0) goto L3b
            r15 = r13
            javax.net.ssl.HttpsURLConnection r15 = (javax.net.ssl.HttpsURLConnection) r15     // Catch: java.io.IOException -> L290
            javax.net.ssl.SSLSocketFactory r10 = r1.zzc     // Catch: java.io.IOException -> L290
            r15.setSSLSocketFactory(r10)     // Catch: java.io.IOException -> L290
        L3b:
            int r10 = r1.zzd     // Catch: java.io.IOException -> L290
            r13.setConnectTimeout(r10)     // Catch: java.io.IOException -> L290
            int r10 = r1.zze     // Catch: java.io.IOException -> L290
            r13.setReadTimeout(r10)     // Catch: java.io.IOException -> L290
            com.google.android.gms.internal.ads.zzhb r10 = r1.zzg     // Catch: java.io.IOException -> L290
            java.util.Map r10 = r10.zza()     // Catch: java.io.IOException -> L290
            java.util.Set r10 = r10.entrySet()     // Catch: java.io.IOException -> L290
            java.util.Iterator r10 = r10.iterator()     // Catch: java.io.IOException -> L290
        L53:
            boolean r15 = r10.hasNext()     // Catch: java.io.IOException -> L290
            if (r15 == 0) goto L71
            java.lang.Object r15 = r10.next()     // Catch: java.io.IOException -> L290
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch: java.io.IOException -> L290
            java.lang.Object r16 = r15.getKey()     // Catch: java.io.IOException -> L290
            r12 = r16
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.io.IOException -> L290
            java.lang.Object r15 = r15.getValue()     // Catch: java.io.IOException -> L290
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.io.IOException -> L290
            r13.setRequestProperty(r12, r15)     // Catch: java.io.IOException -> L290
            goto L53
        L71:
            r18 = -1
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L7c
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto Lae
            goto L7d
        L7c:
            r3 = r5
        L7d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L290
            r10.<init>()     // Catch: java.io.IOException -> L290
            java.lang.String r12 = "bytes="
            r10.append(r12)     // Catch: java.io.IOException -> L290
            r10.append(r3)     // Catch: java.io.IOException -> L290
            java.lang.String r12 = "-"
            r10.append(r12)     // Catch: java.io.IOException -> L290
            java.lang.String r10 = r10.toString()     // Catch: java.io.IOException -> L290
            int r12 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r12 == 0) goto La9
            long r3 = r3 + r8
            long r3 = r3 + r18
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L290
            r12.<init>()     // Catch: java.io.IOException -> L290
            r12.append(r10)     // Catch: java.io.IOException -> L290
            r12.append(r3)     // Catch: java.io.IOException -> L290
            java.lang.String r10 = r12.toString()     // Catch: java.io.IOException -> L290
        La9:
            java.lang.String r3 = "Range"
            r13.setRequestProperty(r3, r10)     // Catch: java.io.IOException -> L290
        Lae:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.zzf     // Catch: java.io.IOException -> L290
            r13.setRequestProperty(r3, r4)     // Catch: java.io.IOException -> L290
            if (r11 != 0) goto Lbe
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r13.setRequestProperty(r3, r4)     // Catch: java.io.IOException -> L290
        Lbe:
            r3 = 0
            r13.setInstanceFollowRedirects(r3)     // Catch: java.io.IOException -> L290
            r13.setDoOutput(r3)     // Catch: java.io.IOException -> L290
            r13.connect()     // Catch: java.io.IOException -> L290
            int r4 = r13.getResponseCode()     // Catch: java.io.IOException -> L290
            r10 = 300(0x12c, float:4.2E-43)
            if (r4 == r10) goto L232
            r10 = 301(0x12d, float:4.22E-43)
            if (r4 == r10) goto L232
            r10 = 302(0x12e, float:4.23E-43)
            if (r4 == r10) goto L232
            r10 = 303(0x12f, float:4.25E-43)
            if (r4 == r10) goto L232
            r10 = 307(0x133, float:4.3E-43)
            if (r4 == r10) goto L232
            r10 = 308(0x134, float:4.32E-43)
            if (r4 != r10) goto Le6
            goto L232
        Le6:
            r1.zzi = r13     // Catch: java.io.IOException -> L290
            int r0 = r13.getResponseCode()     // Catch: java.io.IOException -> L212
            r1.zzl = r0     // Catch: java.io.IOException -> L212
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L1ea
            r3 = 299(0x12b, float:4.19E-43)
            if (r0 <= r3) goto Lf8
            goto L1ea
        Lf8:
            if (r0 != r2) goto L102
            long r2 = r7.zze
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L104
        L102:
            r2 = 0
        L104:
            r1.zzm = r2
            r2 = 1
            boolean r0 = r7.zzb(r2)
            if (r0 != 0) goto L1c8
            long r2 = r7.zzf
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L117
            r1.zzn = r2
            goto L1cc
        L117:
            java.net.HttpURLConnection r0 = r1.zzi
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.getHeaderField(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "]"
            if (r3 != 0) goto L143
            long r5 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L12c
            goto L145
        L12c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unexpected Content-Length ["
            r3.append(r5)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
        L143:
            r5 = r18
        L145:
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L1bb
            java.util.regex.Pattern r3 = com.google.android.gms.internal.ads.zzceg.zza
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L1bb
            r8 = 2
            java.lang.String r8 = r3.group(r8)     // Catch: java.lang.NumberFormatException -> L1a4
            long r8 = java.lang.Long.parseLong(r8)     // Catch: java.lang.NumberFormatException -> L1a4
            r10 = 1
            java.lang.String r3 = r3.group(r10)     // Catch: java.lang.NumberFormatException -> L1a4
            long r10 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L1a4
            long r8 = r8 - r10
            r16 = 0
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            r10 = 1
            long r8 = r8 + r10
            if (r3 >= 0) goto L17b
            r5 = r8
            goto L1bb
        L17b:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L1bb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L1a4
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L1a4
            java.lang.String r10 = "Inconsistent headers ["
            r3.append(r10)     // Catch: java.lang.NumberFormatException -> L1a4
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> L1a4
            java.lang.String r2 = "] ["
            r3.append(r2)     // Catch: java.lang.NumberFormatException -> L1a4
            r3.append(r0)     // Catch: java.lang.NumberFormatException -> L1a4
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L1a4
            java.lang.String r2 = r3.toString()     // Catch: java.lang.NumberFormatException -> L1a4
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)     // Catch: java.lang.NumberFormatException -> L1a4
            long r2 = java.lang.Math.max(r5, r8)     // Catch: java.lang.NumberFormatException -> L1a4
            r5 = r2
            goto L1bb
        L1a4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected Content-Range ["
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
        L1bb:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 == 0) goto L1c3
            long r2 = r1.zzm
            long r18 = r5 - r2
        L1c3:
            r2 = r18
            r1.zzn = r2
            goto L1cc
        L1c8:
            long r2 = r7.zzf
            r1.zzn = r2
        L1cc:
            java.net.HttpURLConnection r0 = r1.zzi     // Catch: java.io.IOException -> L1dd
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L1dd
            r1.zzj = r0     // Catch: java.io.IOException -> L1dd
            r2 = 1
            r1.zzk = r2
            r20.zzj(r21)
            long r2 = r1.zzn
            return r2
        L1dd:
            r0 = move-exception
            r20.zzn()
            com.google.android.gms.internal.ads.zzgy r2 = new com.google.android.gms.internal.ads.zzgy
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 1
            r2.<init>(r0, r7, r3, r4)
            throw r2
        L1ea:
            java.net.HttpURLConnection r0 = r1.zzi
            java.util.Map r6 = r0.getHeaderFields()
            r20.zzn()
            com.google.android.gms.internal.ads.zzha r0 = new com.google.android.gms.internal.ads.zzha
            int r3 = r1.zzl
            r4 = 0
            r5 = 0
            byte[] r8 = com.google.android.gms.internal.ads.zzeu.zzf
            r2 = r0
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r2 = r1.zzl
            r3 = 416(0x1a0, float:5.83E-43)
            if (r2 != r3) goto L211
            com.google.android.gms.internal.ads.zzgh r2 = new com.google.android.gms.internal.ads.zzgh
            r3 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r3)
            r0.initCause(r2)
        L211:
            throw r0
        L212:
            r0 = move-exception
            r4 = r0
            r20.zzn()
            com.google.android.gms.internal.ads.zzgy r0 = new com.google.android.gms.internal.ads.zzgy
            android.net.Uri r3 = r7.zza
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r2.concat(r3)
            r6 = 2000(0x7d0, float:2.803E-42)
            r8 = 1
            r2 = r0
            r5 = r21
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            throw r0
        L232:
            r4 = 1
            r16 = 0
            java.lang.String r10 = "Location"
            java.lang.String r10 = r13.getHeaderField(r10)     // Catch: java.io.IOException -> L290
            r13.disconnect()     // Catch: java.io.IOException -> L290
            if (r10 == 0) goto L271
            java.net.URL r12 = new java.net.URL     // Catch: java.io.IOException -> L290
            r12.<init>(r0, r10)     // Catch: java.io.IOException -> L290
            java.lang.String r0 = r12.getProtocol()     // Catch: java.io.IOException -> L290
            java.lang.String r10 = "https"
            boolean r10 = r10.equals(r0)     // Catch: java.io.IOException -> L290
            if (r10 != 0) goto L26a
            java.lang.String r10 = "http"
            boolean r10 = r10.equals(r0)     // Catch: java.io.IOException -> L290
            if (r10 == 0) goto L25a
            goto L26a
        L25a:
            java.net.ProtocolException r3 = new java.net.ProtocolException     // Catch: java.io.IOException -> L290
            java.lang.String r4 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L290
            java.lang.String r0 = r4.concat(r0)     // Catch: java.io.IOException -> L290
            r3.<init>(r0)     // Catch: java.io.IOException -> L290
            throw r3     // Catch: java.io.IOException -> L290
        L26a:
            r0 = r12
            r13 = r14
            r3 = r16
            r10 = 1
            goto L23
        L271:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> L290
            java.lang.String r3 = "Null location redirect"
            r0.<init>(r3)     // Catch: java.io.IOException -> L290
            throw r0     // Catch: java.io.IOException -> L290
        L279:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch: java.io.IOException -> L290
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L290
            r3.<init>()     // Catch: java.io.IOException -> L290
            java.lang.String r4 = "Too many redirects: "
            r3.append(r4)     // Catch: java.io.IOException -> L290
            r3.append(r14)     // Catch: java.io.IOException -> L290
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> L290
            r0.<init>(r3)     // Catch: java.io.IOException -> L290
            throw r0     // Catch: java.io.IOException -> L290
        L290:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.internal.ads.zzgy r0 = new com.google.android.gms.internal.ads.zzgy
            android.net.Uri r3 = r7.zza
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r2.concat(r3)
            r6 = 2000(0x7d0, float:2.803E-42)
            r8 = 1
            r2 = r0
            r5 = r21
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.zzi
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.net.URL r0 = r0.getURL()
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws com.google.android.gms.internal.ads.zzgy {
            r7 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r7.zzj     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L18
            int r3 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L2c
            r2.close()     // Catch: java.io.IOException -> Lc java.lang.Throwable -> L2c
            goto L18
        Lc:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgy r3 = new com.google.android.gms.internal.ads.zzgy     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.ads.zzgm r4 = r7.zzh     // Catch: java.lang.Throwable -> L2c
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            throw r3     // Catch: java.lang.Throwable -> L2c
        L18:
            r7.zzj = r1
            r7.zzn()
            boolean r1 = r7.zzk
            if (r1 == 0) goto L26
            r7.zzk = r0
            r7.zzh()
        L26:
            java.util.Set r0 = r7.zzr
            r0.clear()
            return
        L2c:
            r2 = move-exception
            r7.zzj = r1
            r7.zzn()
            boolean r1 = r7.zzk
            if (r1 == 0) goto L3b
            r7.zzk = r0
            r7.zzh()
        L3b:
            java.util.Set r0 = r7.zzr
            r0.clear()
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzgg
    public final java.util.Map zze() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.zzi
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map r0 = r0.getHeaderFields()
            return r0
    }

    final void zzm(int r3) {
            r2 = this;
            r2.zzq = r3
            java.util.Set r3 = r2.zzr
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            java.net.Socket r0 = (java.net.Socket) r0
            boolean r1 = r0.isClosed()
            if (r1 != 0) goto L8
            int r1 = r2.zzq     // Catch: java.net.SocketException -> L20
            r0.setReceiveBufferSize(r1)     // Catch: java.net.SocketException -> L20
            goto L8
        L20:
            r0 = move-exception
            java.lang.String r1 = "Failed to update receive buffer size."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            goto L8
        L27:
            return
    }
}
