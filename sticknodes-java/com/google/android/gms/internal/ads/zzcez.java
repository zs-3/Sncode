package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcez extends com.google.android.gms.internal.ads.zzfz implements com.google.android.gms.internal.ads.zzhc {
    private static final java.util.regex.Pattern zza = null;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzhb zze;
    private com.google.android.gms.internal.ads.zzgm zzf;
    private java.net.HttpURLConnection zzg;
    private final java.util.Queue zzh;
    private java.io.InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    static {
            java.lang.String r0 = "^bytes (\\d+)-(\\d+)/(\\d+)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzcez.zza = r0
            return
    }

    zzcez(java.lang.String r2, com.google.android.gms.internal.ads.zzhh r3, int r4, int r5, long r6, long r8) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzdi.zzc(r2)
            r1.zzd = r2
            com.google.android.gms.internal.ads.zzhb r2 = new com.google.android.gms.internal.ads.zzhb
            r2.<init>()
            r1.zze = r2
            r1.zzb = r4
            r1.zzc = r5
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.zzh = r2
            r1.zzq = r6
            r1.zzr = r8
            if (r3 == 0) goto L24
            r1.zzf(r3)
        L24:
            return
    }

    private final void zzl() {
            r2 = this;
        L0:
            java.util.Queue r0 = r2.zzh
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1b
            java.util.Queue r0 = r2.zzh
            java.lang.Object r0 = r0.remove()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r0.disconnect()     // Catch: java.lang.Exception -> L14
            goto L0
        L14:
            r0 = move-exception
            java.lang.String r1 = "Unexpected error while disconnecting"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            goto L0
        L1b:
            r0 = 0
            r2.zzg = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] r18, int r19, int r20) throws com.google.android.gms.internal.ads.zzgy {
            r17 = this;
            r7 = r17
            r0 = r20
            r8 = -1
            if (r0 != 0) goto L9
            r8 = 0
            goto L6c
        L9:
            long r1 = r7.zzl     // Catch: java.io.IOException -> L73
            long r3 = r7.zzm     // Catch: java.io.IOException -> L73
            long r1 = r1 - r3
            r5 = 0
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L15
            goto L6c
        L15:
            long r1 = r7.zzn     // Catch: java.io.IOException -> L73
            long r1 = r1 + r3
            long r9 = (long) r0     // Catch: java.io.IOException -> L73
            long r3 = r7.zzr     // Catch: java.io.IOException -> L73
            long r1 = r1 + r9
            long r1 = r1 + r3
            long r5 = r7.zzp     // Catch: java.io.IOException -> L73
            r11 = 1
            long r13 = r5 + r11
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L4a
            long r0 = r7.zzo     // Catch: java.io.IOException -> L73
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L4a
            long r5 = r7.zzq     // Catch: java.io.IOException -> L73
            long r5 = r5 + r13
            long r5 = r5 - r3
            r2 = -1
            long r5 = r5 + r2
            long r15 = r13 + r9
            long r2 = r2 + r15
            long r2 = java.lang.Math.max(r5, r2)     // Catch: java.io.IOException -> L73
            long r4 = java.lang.Math.min(r0, r2)     // Catch: java.io.IOException -> L73
            r6 = 2
            r1 = r17
            r2 = r13
            r13 = r4
            r1.zzk(r2, r4, r6)     // Catch: java.io.IOException -> L73
            r7.zzp = r13     // Catch: java.io.IOException -> L73
            r5 = r13
        L4a:
            long r5 = r5 + r11
            long r0 = r7.zzn     // Catch: java.io.IOException -> L73
            long r5 = r5 - r0
            long r0 = r7.zzm     // Catch: java.io.IOException -> L73
            long r5 = r5 - r0
            long r0 = java.lang.Math.min(r9, r5)     // Catch: java.io.IOException -> L73
            int r1 = (int) r0     // Catch: java.io.IOException -> L73
            java.io.InputStream r0 = r7.zzi     // Catch: java.io.IOException -> L73
            r2 = r18
            r3 = r19
            int r0 = r0.read(r2, r3, r1)     // Catch: java.io.IOException -> L73
            if (r0 == r8) goto L6d
            long r1 = r7.zzm     // Catch: java.io.IOException -> L73
            long r3 = (long) r0     // Catch: java.io.IOException -> L73
            long r1 = r1 + r3
            r7.zzm = r1     // Catch: java.io.IOException -> L73
            r7.zzg(r0)     // Catch: java.io.IOException -> L73
            r8 = r0
        L6c:
            return r8
        L6d:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.io.IOException -> L73
            r0.<init>()     // Catch: java.io.IOException -> L73
            throw r0     // Catch: java.io.IOException -> L73
        L73:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgy r1 = new com.google.android.gms.internal.ads.zzgy
            com.google.android.gms.internal.ads.zzgm r2 = r7.zzf
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 2
            r1.<init>(r0, r2, r3, r4)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(com.google.android.gms.internal.ads.zzgm r11) throws com.google.android.gms.internal.ads.zzgy {
            r10 = this;
            r10.zzf = r11
            r0 = 0
            r10.zzm = r0
            long r3 = r11.zze
            long r0 = r11.zzf
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L13
            long r0 = r10.zzq
            goto L19
        L13:
            long r5 = r10.zzq
            long r0 = java.lang.Math.min(r5, r0)
        L19:
            long r0 = r0 + r3
            long r5 = r0 + r8
            r10.zzn = r3
            r7 = 1
            r2 = r10
            java.net.HttpURLConnection r0 = r2.zzk(r3, r5, r7)
            r10.zzg = r0
            java.lang.String r1 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L97
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.zzcez.zza
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r2 = r1.find()
            if (r2 == 0) goto L97
            r2 = 1
            java.lang.String r3 = r1.group(r2)     // Catch: java.lang.NumberFormatException -> L7e
            java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L7e
            r3 = 2
            java.lang.String r3 = r1.group(r3)     // Catch: java.lang.NumberFormatException -> L7e
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L7e
            r5 = 3
            java.lang.String r1 = r1.group(r5)     // Catch: java.lang.NumberFormatException -> L7e
            long r0 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L7e
            long r5 = r11.zzf
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L6b
            r10.zzl = r5
            long r0 = r10.zzn
            long r0 = r0 + r5
            long r0 = r0 + r8
            long r0 = java.lang.Math.max(r3, r0)
            r10.zzo = r0
            goto L74
        L6b:
            long r5 = r10.zzn
            long r5 = r0 - r5
            r10.zzl = r5
            long r0 = r0 + r8
            r10.zzo = r0
        L74:
            r10.zzp = r3
            r10.zzj = r2
            r10.zzj(r11)
            long r0 = r10.zzl
            return r0
        L7e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected Content-Range ["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r1)
        L97:
            com.google.android.gms.internal.ads.zzcex r1 = new com.google.android.gms.internal.ads.zzcex
            r1.<init>(r0, r11)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final android.net.Uri zzc() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.zzg
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
            java.io.InputStream r2 = r7.zzi     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L16
            r2.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L25
            goto L16
        La:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgy r3 = new com.google.android.gms.internal.ads.zzgy     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgm r4 = r7.zzf     // Catch: java.lang.Throwable -> L25
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            throw r3     // Catch: java.lang.Throwable -> L25
        L16:
            r7.zzi = r1
            r7.zzl()
            boolean r1 = r7.zzj
            if (r1 == 0) goto L24
            r7.zzj = r0
            r7.zzh()
        L24:
            return
        L25:
            r2 = move-exception
            r7.zzi = r1
            r7.zzl()
            boolean r1 = r7.zzj
            if (r1 == 0) goto L34
            r7.zzj = r0
            r7.zzh()
        L34:
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzgg
    public final java.util.Map zze() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.zzg
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Map r0 = r0.getHeaderFields()
            return r0
    }

    final java.net.HttpURLConnection zzk(long r9, long r11, int r13) throws com.google.android.gms.internal.ads.zzgy {
            r8 = this;
            java.lang.String r0 = "Unable to connect to "
            com.google.android.gms.internal.ads.zzgm r1 = r8.zzf
            android.net.Uri r1 = r1.zza
            java.lang.String r1 = r1.toString()
            java.net.URL r2 = new java.net.URL     // Catch: java.io.IOException -> Le3
            r2.<init>(r1)     // Catch: java.io.IOException -> Le3
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.io.IOException -> Le3
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.io.IOException -> Le3
            int r3 = r8.zzb     // Catch: java.io.IOException -> Le3
            r2.setConnectTimeout(r3)     // Catch: java.io.IOException -> Le3
            int r3 = r8.zzc     // Catch: java.io.IOException -> Le3
            r2.setReadTimeout(r3)     // Catch: java.io.IOException -> Le3
            com.google.android.gms.internal.ads.zzhb r3 = r8.zze     // Catch: java.io.IOException -> Le3
            java.util.Map r3 = r3.zza()     // Catch: java.io.IOException -> Le3
            java.util.Set r3 = r3.entrySet()     // Catch: java.io.IOException -> Le3
            java.util.Iterator r3 = r3.iterator()     // Catch: java.io.IOException -> Le3
        L2d:
            boolean r4 = r3.hasNext()     // Catch: java.io.IOException -> Le3
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()     // Catch: java.io.IOException -> Le3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.io.IOException -> Le3
            java.lang.Object r5 = r4.getKey()     // Catch: java.io.IOException -> Le3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.io.IOException -> Le3
            java.lang.Object r4 = r4.getValue()     // Catch: java.io.IOException -> Le3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.io.IOException -> Le3
            r2.setRequestProperty(r5, r4)     // Catch: java.io.IOException -> Le3
            goto L2d
        L49:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Le3
            r3.<init>()     // Catch: java.io.IOException -> Le3
            java.lang.String r4 = "bytes="
            r3.append(r4)     // Catch: java.io.IOException -> Le3
            r3.append(r9)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "-"
            r3.append(r9)     // Catch: java.io.IOException -> Le3
            r3.append(r11)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = r3.toString()     // Catch: java.io.IOException -> Le3
            java.lang.String r10 = "Range"
            r2.setRequestProperty(r10, r9)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "User-Agent"
            java.lang.String r10 = r8.zzd     // Catch: java.io.IOException -> Le3
            r2.setRequestProperty(r9, r10)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "Accept-Encoding"
            java.lang.String r10 = "identity"
            r2.setRequestProperty(r9, r10)     // Catch: java.io.IOException -> Le3
            java.lang.String r9 = "GET"
            r2.setRequestMethod(r9)     // Catch: java.io.IOException -> Le3
            r2.connect()     // Catch: java.io.IOException -> Le3
            java.util.Queue r9 = r8.zzh     // Catch: java.io.IOException -> Le3
            r9.add(r2)     // Catch: java.io.IOException -> Le3
            com.google.android.gms.internal.ads.zzgm r9 = r8.zzf
            android.net.Uri r9 = r9.zza
            java.lang.String r9 = r9.toString()
            int r10 = r2.getResponseCode()     // Catch: java.io.IOException -> Lca
            r8.zzk = r10     // Catch: java.io.IOException -> Lca
            r9 = 200(0xc8, float:2.8E-43)
            if (r10 < r9) goto Lb9
            r9 = 299(0x12b, float:4.19E-43)
            if (r10 > r9) goto Lb9
            java.io.InputStream r9 = r2.getInputStream()     // Catch: java.io.IOException -> Lab
            java.io.InputStream r10 = r8.zzi     // Catch: java.io.IOException -> Lab
            if (r10 == 0) goto La8
            java.io.SequenceInputStream r10 = new java.io.SequenceInputStream     // Catch: java.io.IOException -> Lab
            java.io.InputStream r11 = r8.zzi     // Catch: java.io.IOException -> Lab
            r10.<init>(r11, r9)     // Catch: java.io.IOException -> Lab
            r9 = r10
        La8:
            r8.zzi = r9     // Catch: java.io.IOException -> Lab
            return r2
        Lab:
            r9 = move-exception
            r8.zzl()
            com.google.android.gms.internal.ads.zzgy r10 = new com.google.android.gms.internal.ads.zzgy
            com.google.android.gms.internal.ads.zzgm r11 = r8.zzf
            r12 = 2000(0x7d0, float:2.803E-42)
            r10.<init>(r9, r11, r12, r13)
            throw r10
        Lb9:
            java.util.Map r9 = r2.getHeaderFields()
            r8.zzl()
            com.google.android.gms.internal.ads.zzcey r10 = new com.google.android.gms.internal.ads.zzcey
            int r11 = r8.zzk
            com.google.android.gms.internal.ads.zzgm r12 = r8.zzf
            r10.<init>(r11, r9, r12, r13)
            throw r10
        Lca:
            r10 = move-exception
            r3 = r10
            r8.zzl()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            com.google.android.gms.internal.ads.zzgy r10 = new com.google.android.gms.internal.ads.zzgy
            com.google.android.gms.internal.ads.zzgm r4 = r8.zzf
            java.lang.String r2 = r0.concat(r9)
            r5 = 2000(0x7d0, float:2.803E-42)
            r1 = r10
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            throw r10
        Le3:
            r9 = move-exception
            r4 = r9
            java.lang.String r9 = java.lang.String.valueOf(r1)
            com.google.android.gms.internal.ads.zzgy r10 = new com.google.android.gms.internal.ads.zzgy
            com.google.android.gms.internal.ads.zzgm r5 = r8.zzf
            java.lang.String r3 = r0.concat(r9)
            r6 = 2000(0x7d0, float:2.803E-42)
            r2 = r10
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            throw r10
    }
}
