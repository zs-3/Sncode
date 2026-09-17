package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgu extends com.google.android.gms.internal.ads.zzfz implements com.google.android.gms.internal.ads.zzhc {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzhb zze;
    private final com.google.android.gms.internal.ads.zzhb zzf;
    private com.google.android.gms.internal.ads.zzgm zzg;
    private java.net.HttpURLConnection zzh;
    private java.io.InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzgu(java.lang.String r1, int r2, int r3, boolean r4, boolean r5, com.google.android.gms.internal.ads.zzhb r6, com.google.android.gms.internal.ads.zzfya r7, boolean r8, com.google.android.gms.internal.ads.zzgt r9) {
            r0 = this;
            r5 = 1
            r0.<init>(r5)
            r0.zzd = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zza = r4
            r0.zze = r6
            com.google.android.gms.internal.ads.zzhb r1 = new com.google.android.gms.internal.ads.zzhb
            r1.<init>()
            r0.zzf = r1
            return
    }

    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzb
            r3.setConnectTimeout(r4)
            int r4 = r2.zzc
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzhb r5 = r2.zze
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzhb r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            r0 = -1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.zzd
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r4 = "identity"
            goto L94
        L92:
            java.lang.String r4 = "gzip"
        L94:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.zzgm.zzh
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
    }

    private final java.net.URL zzl(java.net.URL r6, java.lang.String r7, com.google.android.gms.internal.ads.zzgm r8) throws com.google.android.gms.internal.ads.zzgy {
            r5 = this;
            r0 = 1
            r1 = 2001(0x7d1, float:2.804E-42)
            if (r7 == 0) goto L6e
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L67
            r2.<init>(r6, r7)     // Catch: java.net.MalformedURLException -> L67
            java.lang.String r7 = r2.getProtocol()
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L2f
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L1f
            goto L2f
        L1f:
            java.lang.String r6 = java.lang.String.valueOf(r7)
            com.google.android.gms.internal.ads.zzgy r7 = new com.google.android.gms.internal.ads.zzgy
            java.lang.String r2 = "Unsupported protocol redirect: "
            java.lang.String r6 = r2.concat(r6)
            r7.<init>(r6, r8, r1, r0)
            throw r7
        L2f:
            boolean r3 = r5.zza
            if (r3 != 0) goto L66
            java.lang.String r3 = r6.getProtocol()
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L3e
            goto L66
        L3e:
            com.google.android.gms.internal.ads.zzgy r2 = new com.google.android.gms.internal.ads.zzgy
            java.lang.String r6 = r6.getProtocol()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Disallowed cross-protocol redirect ("
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " to "
            r3.append(r6)
            r3.append(r7)
            java.lang.String r6 = ")"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r8, r1, r0)
            throw r2
        L66:
            return r2
        L67:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzgy r7 = new com.google.android.gms.internal.ads.zzgy
            r7.<init>(r6, r8, r1, r0)
            throw r7
        L6e:
            com.google.android.gms.internal.ads.zzgy r6 = new com.google.android.gms.internal.ads.zzgy
            java.lang.String r7 = "Null location redirect"
            r6.<init>(r7, r8, r1, r0)
            throw r6
    }

    private final void zzm() {
            r3 = this;
            java.net.HttpURLConnection r0 = r3.zzh
            if (r0 == 0) goto L13
            r0.disconnect()     // Catch: java.lang.Exception -> L8
            goto L10
        L8:
            r0 = move-exception
            java.lang.String r1 = "DefaultHttpDataSource"
            java.lang.String r2 = "Unexpected error while disconnecting"
            com.google.android.gms.internal.ads.zzea.zzd(r1, r2, r0)
        L10:
            r0 = 0
            r3.zzh = r0
        L13:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r7, int r8, int r9) throws com.google.android.gms.internal.ads.zzgy {
            r6 = this;
            r0 = -1
            if (r9 != 0) goto L5
            r0 = 0
            goto L32
        L5:
            long r1 = r6.zzl     // Catch: java.io.IOException -> L33
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1d
            long r3 = r6.zzm     // Catch: java.io.IOException -> L33
            long r1 = r1 - r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L17
            goto L32
        L17:
            long r3 = (long) r9     // Catch: java.io.IOException -> L33
            long r1 = java.lang.Math.min(r3, r1)     // Catch: java.io.IOException -> L33
            int r9 = (int) r1     // Catch: java.io.IOException -> L33
        L1d:
            java.io.InputStream r1 = r6.zzi     // Catch: java.io.IOException -> L33
            int r2 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.io.IOException -> L33
            int r7 = r1.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r0) goto L28
            goto L32
        L28:
            long r8 = r6.zzm     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.zzm = r8     // Catch: java.io.IOException -> L33
            r6.zzg(r7)     // Catch: java.io.IOException -> L33
            r0 = r7
        L32:
            return r0
        L33:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzgm r8 = r6.zzg
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            r9 = 2
            com.google.android.gms.internal.ads.zzgy r7 = com.google.android.gms.internal.ads.zzgy.zza(r7, r8, r9)
            throw r7
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r25) throws com.google.android.gms.internal.ads.zzgy {
            r24 = this;
            r12 = r24
            r13 = r25
            r12.zzg = r13
            r14 = 0
            r12.zzm = r14
            r12.zzl = r14
            r24.zzi(r25)
            r11 = 1
            java.net.URL r2 = new java.net.URL     // Catch: java.io.IOException -> L1ee
            android.net.Uri r0 = r13.zza     // Catch: java.io.IOException -> L1ee
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L1ee
            r2.<init>(r0)     // Catch: java.io.IOException -> L1ee
            long r9 = r13.zze     // Catch: java.io.IOException -> L1ee
            long r7 = r13.zzf     // Catch: java.io.IOException -> L1ee
            boolean r0 = r13.zzb(r11)     // Catch: java.io.IOException -> L1ee
            boolean r1 = r12.zza     // Catch: java.io.IOException -> L1ee
            r5 = 0
            if (r1 != 0) goto L3d
            r3 = 1
            r4 = 0
            r16 = 1
            java.util.Map r6 = r13.zzd     // Catch: java.io.IOException -> L1ee
            r1 = r24
            r17 = r6
            r5 = r9
            r9 = r0
            r10 = r16
            r11 = r17
            java.net.HttpURLConnection r0 = r1.zzk(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch: java.io.IOException -> L1ee
            goto L87
        L3d:
            r11 = r2
            r5 = 0
        L3f:
            int r6 = r5 + 1
            r1 = 20
            if (r5 > r1) goto L1c9
            r3 = 1
            r4 = 0
            r16 = 0
            java.util.Map r5 = r13.zzd     // Catch: java.io.IOException -> L1ee
            r1 = r24
            r2 = r11
            r17 = r5
            r18 = r6
            r5 = r9
            r19 = r7
            r21 = r9
            r9 = r0
            r10 = r16
            r23 = r11
            r11 = r17
            java.net.HttpURLConnection r1 = r1.zzk(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch: java.io.IOException -> L1ee
            int r2 = r1.getResponseCode()     // Catch: java.io.IOException -> L1ee
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch: java.io.IOException -> L1ee
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 == r4) goto L1b6
            r4 = 301(0x12d, float:4.22E-43)
            if (r2 == r4) goto L1b6
            r4 = 302(0x12e, float:4.23E-43)
            if (r2 == r4) goto L1b6
            r4 = 303(0x12f, float:4.25E-43)
            if (r2 == r4) goto L1b6
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L1b6
            r4 = 308(0x134, float:4.32E-43)
            if (r2 != r4) goto L86
            goto L1b6
        L86:
            r0 = r1
        L87:
            r12.zzh = r0     // Catch: java.io.IOException -> L1ee
            int r1 = r0.getResponseCode()     // Catch: java.io.IOException -> L1ee
            r12.zzk = r1     // Catch: java.io.IOException -> L1ee
            java.lang.String r3 = r0.getResponseMessage()     // Catch: java.io.IOException -> L1ee
            int r1 = r12.zzk
            r2 = 2008(0x7d8, float:2.814E-42)
            java.lang.String r4 = "Content-Range"
            r5 = 200(0xc8, float:2.8E-43)
            r6 = -1
            if (r1 < r5) goto L15e
            r8 = 299(0x12b, float:4.19E-43)
            if (r1 <= r8) goto La5
            goto L15e
        La5:
            r0.getContentType()
            int r1 = r12.zzk
            if (r1 != r5) goto Lb2
            long r8 = r13.zze
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 != 0) goto Lb3
        Lb2:
            r8 = r14
        Lb3:
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r1 = r0.getHeaderField(r1)
            java.lang.String r3 = "gzip"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto Le1
            long r10 = r13.zzf
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 == 0) goto Lca
            r12.zzl = r10
            goto Le5
        Lca:
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            java.lang.String r4 = r0.getHeaderField(r4)
            long r3 = com.google.android.gms.internal.ads.zzhd.zza(r3, r4)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto Lde
            long r6 = r3 - r8
        Lde:
            r12.zzl = r6
            goto Le5
        Le1:
            long r3 = r13.zzf
            r12.zzl = r3
        Le5:
            r3 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L153
            r12.zzi = r0     // Catch: java.io.IOException -> L153
            if (r1 == 0) goto Lf8
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.io.IOException -> L153
            java.io.InputStream r1 = r12.zzi     // Catch: java.io.IOException -> L153
            r0.<init>(r1)     // Catch: java.io.IOException -> L153
            r12.zzi = r0     // Catch: java.io.IOException -> L153
        Lf8:
            r5 = 1
            r12.zzj = r5
            r24.zzj(r25)
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L103
            goto L13f
        L103:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L142
        L107:
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 <= 0) goto L13f
            r6 = 4096(0x1000, double:2.0237E-320)
            long r6 = java.lang.Math.min(r8, r6)     // Catch: java.io.IOException -> L142
            int r1 = (int) r6     // Catch: java.io.IOException -> L142
            java.io.InputStream r4 = r12.zzi     // Catch: java.io.IOException -> L142
            int r6 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.io.IOException -> L142
            r6 = 0
            int r1 = r4.read(r0, r6, r1)     // Catch: java.io.IOException -> L142
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.io.IOException -> L142
            boolean r4 = r4.isInterrupted()     // Catch: java.io.IOException -> L142
            if (r4 != 0) goto L134
            r4 = -1
            if (r1 == r4) goto L12e
            long r10 = (long) r1     // Catch: java.io.IOException -> L142
            long r8 = r8 - r10
            r12.zzg(r1)     // Catch: java.io.IOException -> L142
            goto L107
        L12e:
            com.google.android.gms.internal.ads.zzgy r0 = new com.google.android.gms.internal.ads.zzgy     // Catch: java.io.IOException -> L142
            r0.<init>(r13, r2, r5)     // Catch: java.io.IOException -> L142
            throw r0     // Catch: java.io.IOException -> L142
        L134:
            com.google.android.gms.internal.ads.zzgy r0 = new com.google.android.gms.internal.ads.zzgy     // Catch: java.io.IOException -> L142
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L142
            r1.<init>()     // Catch: java.io.IOException -> L142
            r0.<init>(r1, r13, r3, r5)     // Catch: java.io.IOException -> L142
            throw r0     // Catch: java.io.IOException -> L142
        L13f:
            long r0 = r12.zzl
            return r0
        L142:
            r0 = move-exception
            r24.zzm()
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgy
            if (r1 == 0) goto L14d
            com.google.android.gms.internal.ads.zzgy r0 = (com.google.android.gms.internal.ads.zzgy) r0
            throw r0
        L14d:
            com.google.android.gms.internal.ads.zzgy r1 = new com.google.android.gms.internal.ads.zzgy
            r1.<init>(r0, r13, r3, r5)
            throw r1
        L153:
            r0 = move-exception
            r5 = 1
            r24.zzm()
            com.google.android.gms.internal.ads.zzgy r1 = new com.google.android.gms.internal.ads.zzgy
            r1.<init>(r0, r13, r3, r5)
            throw r1
        L15e:
            r5 = 1
            java.util.Map r8 = r0.getHeaderFields()
            int r1 = r12.zzk
            r9 = 416(0x1a0, float:5.83E-43)
            if (r1 != r9) goto L185
            java.lang.String r1 = r0.getHeaderField(r4)
            long r10 = com.google.android.gms.internal.ads.zzhd.zzb(r1)
            r4 = r3
            long r2 = r13.zze
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 != 0) goto L186
            r12.zzj = r5
            r24.zzj(r25)
            long r0 = r13.zzf
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L184
            return r0
        L184:
            return r14
        L185:
            r4 = r3
        L186:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L191
            byte[] r0 = com.google.android.gms.internal.ads.zzgdh.zzb(r0)     // Catch: java.io.IOException -> L195
            goto L193
        L191:
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf     // Catch: java.io.IOException -> L195
        L193:
            r7 = r0
            goto L198
        L195:
            byte[] r0 = com.google.android.gms.internal.ads.zzeu.zzf
            goto L193
        L198:
            r24.zzm()
            int r0 = r12.zzk
            if (r0 != r9) goto L1a7
            com.google.android.gms.internal.ads.zzgh r0 = new com.google.android.gms.internal.ads.zzgh
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1)
            goto L1a8
        L1a7:
            r0 = 0
        L1a8:
            com.google.android.gms.internal.ads.zzha r9 = new com.google.android.gms.internal.ads.zzha
            int r2 = r12.zzk
            r1 = r9
            r3 = r4
            r4 = r0
            r5 = r8
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7)
            throw r9
        L1b6:
            r5 = 1
            r6 = 0
            r1.disconnect()     // Catch: java.io.IOException -> L1ec
            r2 = r23
            java.net.URL r11 = r12.zzl(r2, r3, r13)     // Catch: java.io.IOException -> L1ec
            r5 = r18
            r7 = r19
            r9 = r21
            goto L3f
        L1c9:
            r18 = r6
            r5 = 1
            com.google.android.gms.internal.ads.zzgy r0 = new com.google.android.gms.internal.ads.zzgy     // Catch: java.io.IOException -> L1ec
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException     // Catch: java.io.IOException -> L1ec
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1ec
            r2.<init>()     // Catch: java.io.IOException -> L1ec
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch: java.io.IOException -> L1ec
            r3 = r18
            r2.append(r3)     // Catch: java.io.IOException -> L1ec
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L1ec
            r1.<init>(r2)     // Catch: java.io.IOException -> L1ec
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.<init>(r1, r13, r2, r5)     // Catch: java.io.IOException -> L1ec
            throw r0     // Catch: java.io.IOException -> L1ec
        L1ec:
            r0 = move-exception
            goto L1f0
        L1ee:
            r0 = move-exception
            r5 = 1
        L1f0:
            r24.zzm()
            com.google.android.gms.internal.ads.zzgy r0 = com.google.android.gms.internal.ads.zzgy.zza(r0, r13, r5)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.zzh
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
            java.io.InputStream r2 = r7.zzi     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L18
            r2.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L27
            goto L18
        La:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgy r3 = new com.google.android.gms.internal.ads.zzgy     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzgm r4 = r7.zzg     // Catch: java.lang.Throwable -> L27
            int r5 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L27
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L27
            throw r3     // Catch: java.lang.Throwable -> L27
        L18:
            r7.zzi = r1
            r7.zzm()
            boolean r1 = r7.zzj
            if (r1 == 0) goto L26
            r7.zzj = r0
            r7.zzh()
        L26:
            return
        L27:
            r2 = move-exception
            r7.zzi = r1
            r7.zzm()
            boolean r1 = r7.zzj
            if (r1 == 0) goto L36
            r7.zzj = r0
            r7.zzh()
        L36:
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzgg
    public final java.util.Map zze() {
            r2 = this;
            java.net.HttpURLConnection r0 = r2.zzh
            if (r0 != 0) goto L9
            com.google.android.gms.internal.ads.zzgba r0 = com.google.android.gms.internal.ads.zzgba.zzd()
            return r0
        L9:
            com.google.android.gms.internal.ads.zzgs r1 = new com.google.android.gms.internal.ads.zzgs
            java.util.Map r0 = r0.getHeaderFields()
            r1.<init>(r0)
            return r1
    }
}
