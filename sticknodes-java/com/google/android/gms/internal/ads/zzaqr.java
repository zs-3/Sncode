package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzaqr implements com.google.android.gms.internal.ads.zzapv {
    protected final com.google.android.gms.internal.ads.zzaqt zza;
    private final com.google.android.gms.internal.ads.zzaqq zzb;

    public zzaqr(com.google.android.gms.internal.ads.zzaqq r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzaqt r0 = new com.google.android.gms.internal.ads.zzaqt
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1)
            r2.<init>()
            r2.zzb = r3
            r2.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public com.google.android.gms.internal.ads.zzapy zza(com.google.android.gms.internal.ads.zzaqc r21) throws com.google.android.gms.internal.ads.zzaql {
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "Error occurred when closing InputStream"
            long r4 = android.os.SystemClock.elapsedRealtime()
        La:
            java.util.Collections.emptyList()
            r6 = 1
            r9 = 0
            com.google.android.gms.internal.ads.zzapl r0 = r21.zzd()     // Catch: java.io.IOException -> L1bd
            if (r0 != 0) goto L1a
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch: java.io.IOException -> L1bd
            goto L3a
        L1a:
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.io.IOException -> L1bd
            r10.<init>()     // Catch: java.io.IOException -> L1bd
            java.lang.String r11 = r0.zzb     // Catch: java.io.IOException -> L1bd
            if (r11 == 0) goto L28
            java.lang.String r12 = "If-None-Match"
            r10.put(r12, r11)     // Catch: java.io.IOException -> L1bd
        L28:
            long r11 = r0.zzd     // Catch: java.io.IOException -> L1bd
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L39
            java.lang.String r0 = "If-Modified-Since"
            java.lang.String r11 = com.google.android.gms.internal.ads.zzaqz.zzc(r11)     // Catch: java.io.IOException -> L1bd
            r10.put(r0, r11)     // Catch: java.io.IOException -> L1bd
        L39:
            r0 = r10
        L3a:
            com.google.android.gms.internal.ads.zzaqq r10 = r1.zzb     // Catch: java.io.IOException -> L1bd
            com.google.android.gms.internal.ads.zzara r10 = r10.zza(r2, r0)     // Catch: java.io.IOException -> L1bd
            int r12 = r10.zzb()     // Catch: java.io.IOException -> L1bb
            java.util.List r0 = r10.zzd()     // Catch: java.io.IOException -> L1bb
            r11 = 304(0x130, float:4.26E-43)
            if (r12 != r11) goto L10c
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L1bb
            long r17 = r11 - r4
            com.google.android.gms.internal.ads.zzapl r11 = r21.zzd()     // Catch: java.io.IOException -> L1bb
            if (r11 != 0) goto L67
            com.google.android.gms.internal.ads.zzapy r11 = new com.google.android.gms.internal.ads.zzapy     // Catch: java.io.IOException -> L1bb
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            r13 = r11
            r19 = r0
            r13.<init>(r14, r15, r16, r17, r19)     // Catch: java.io.IOException -> L1bb
            goto L10b
        L67:
            java.util.TreeSet r12 = new java.util.TreeSet     // Catch: java.io.IOException -> L1bb
            java.util.Comparator r13 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch: java.io.IOException -> L1bb
            r12.<init>(r13)     // Catch: java.io.IOException -> L1bb
            boolean r13 = r0.isEmpty()     // Catch: java.io.IOException -> L1bb
            if (r13 != 0) goto L8c
            java.util.Iterator r13 = r0.iterator()     // Catch: java.io.IOException -> L1bb
        L78:
            boolean r14 = r13.hasNext()     // Catch: java.io.IOException -> L1bb
            if (r14 == 0) goto L8c
            java.lang.Object r14 = r13.next()     // Catch: java.io.IOException -> L1bb
            com.google.android.gms.internal.ads.zzapu r14 = (com.google.android.gms.internal.ads.zzapu) r14     // Catch: java.io.IOException -> L1bb
            java.lang.String r14 = r14.zza()     // Catch: java.io.IOException -> L1bb
            r12.add(r14)     // Catch: java.io.IOException -> L1bb
            goto L78
        L8c:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.io.IOException -> L1bb
            r15.<init>(r0)     // Catch: java.io.IOException -> L1bb
            java.util.List r0 = r11.zzh     // Catch: java.io.IOException -> L1bb
            if (r0 == 0) goto Lbb
            boolean r0 = r0.isEmpty()     // Catch: java.io.IOException -> L1bb
            if (r0 != 0) goto Lfa
            java.util.List r0 = r11.zzh     // Catch: java.io.IOException -> L1bb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L1bb
        La1:
            boolean r13 = r0.hasNext()     // Catch: java.io.IOException -> L1bb
            if (r13 == 0) goto Lfa
            java.lang.Object r13 = r0.next()     // Catch: java.io.IOException -> L1bb
            com.google.android.gms.internal.ads.zzapu r13 = (com.google.android.gms.internal.ads.zzapu) r13     // Catch: java.io.IOException -> L1bb
            java.lang.String r14 = r13.zza()     // Catch: java.io.IOException -> L1bb
            boolean r14 = r12.contains(r14)     // Catch: java.io.IOException -> L1bb
            if (r14 != 0) goto La1
            r15.add(r13)     // Catch: java.io.IOException -> L1bb
            goto La1
        Lbb:
            java.util.Map r0 = r11.zzg     // Catch: java.io.IOException -> L1bb
            boolean r0 = r0.isEmpty()     // Catch: java.io.IOException -> L1bb
            if (r0 != 0) goto Lfa
            java.util.Map r0 = r11.zzg     // Catch: java.io.IOException -> L1bb
            java.util.Set r0 = r0.entrySet()     // Catch: java.io.IOException -> L1bb
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L1bb
        Lcd:
            boolean r13 = r0.hasNext()     // Catch: java.io.IOException -> L1bb
            if (r13 == 0) goto Lfa
            java.lang.Object r13 = r0.next()     // Catch: java.io.IOException -> L1bb
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch: java.io.IOException -> L1bb
            java.lang.Object r14 = r13.getKey()     // Catch: java.io.IOException -> L1bb
            boolean r14 = r12.contains(r14)     // Catch: java.io.IOException -> L1bb
            if (r14 != 0) goto Lcd
            com.google.android.gms.internal.ads.zzapu r14 = new com.google.android.gms.internal.ads.zzapu     // Catch: java.io.IOException -> L1bb
            java.lang.Object r16 = r13.getKey()     // Catch: java.io.IOException -> L1bb
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.io.IOException -> L1bb
            java.lang.Object r13 = r13.getValue()     // Catch: java.io.IOException -> L1bb
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.io.IOException -> L1bb
            r14.<init>(r8, r13)     // Catch: java.io.IOException -> L1bb
            r15.add(r14)     // Catch: java.io.IOException -> L1bb
            goto Lcd
        Lfa:
            com.google.android.gms.internal.ads.zzapy r0 = new com.google.android.gms.internal.ads.zzapy     // Catch: java.io.IOException -> L1bb
            r14 = 304(0x130, float:4.26E-43)
            byte[] r8 = r11.zza     // Catch: java.io.IOException -> L1bb
            r16 = 1
            r13 = r0
            r11 = r15
            r15 = r8
            r19 = r11
            r13.<init>(r14, r15, r16, r17, r19)     // Catch: java.io.IOException -> L1bb
            r11 = r0
        L10b:
            return r11
        L10c:
            java.io.InputStream r8 = r10.zzc()     // Catch: java.io.IOException -> L1bb
            if (r8 == 0) goto L156
            int r11 = r10.zza()     // Catch: java.io.IOException -> L1bb
            com.google.android.gms.internal.ads.zzaqt r13 = r1.zza     // Catch: java.io.IOException -> L1bb
            com.google.android.gms.internal.ads.zzarg r14 = new com.google.android.gms.internal.ads.zzarg     // Catch: java.io.IOException -> L1bb
            r14.<init>(r13, r11)     // Catch: java.io.IOException -> L1bb
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = r13.zzb(r11)     // Catch: java.lang.Throwable -> L144
        L123:
            int r15 = r8.read(r11)     // Catch: java.lang.Throwable -> L12e
            r7 = -1
            if (r15 == r7) goto L130
            r14.write(r11, r9, r15)     // Catch: java.lang.Throwable -> L12e
            goto L123
        L12e:
            r0 = move-exception
            goto L146
        L130:
            byte[] r7 = r14.toByteArray()     // Catch: java.lang.Throwable -> L12e
            r8.close()     // Catch: java.io.IOException -> L138
            goto L13d
        L138:
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch: java.io.IOException -> L1bb
            com.google.android.gms.internal.ads.zzaqo.zzd(r3, r8)     // Catch: java.io.IOException -> L1bb
        L13d:
            r13.zza(r11)     // Catch: java.io.IOException -> L1bb
            r14.close()     // Catch: java.io.IOException -> L1bb
            goto L158
        L144:
            r0 = move-exception
            r11 = 0
        L146:
            r8.close()     // Catch: java.io.IOException -> L14a
            goto L14f
        L14a:
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch: java.io.IOException -> L1bb
            com.google.android.gms.internal.ads.zzaqo.zzd(r3, r7)     // Catch: java.io.IOException -> L1bb
        L14f:
            r13.zza(r11)     // Catch: java.io.IOException -> L1bb
            r14.close()     // Catch: java.io.IOException -> L1bb
            throw r0     // Catch: java.io.IOException -> L1bb
        L156:
            byte[] r7 = new byte[r9]     // Catch: java.io.IOException -> L1bb
        L158:
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L1b8
            long r13 = r13 - r4
            boolean r8 = com.google.android.gms.internal.ads.zzaqo.zzb     // Catch: java.io.IOException -> L1b8
            if (r8 != 0) goto L167
            r15 = 3000(0xbb8, double:1.482E-320)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 <= 0) goto L19a
        L167:
            java.lang.String r8 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.io.IOException -> L1b8
            r11[r9] = r2     // Catch: java.io.IOException -> L1b8
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch: java.io.IOException -> L1b8
            r11[r6] = r13     // Catch: java.io.IOException -> L1b8
            if (r7 == 0) goto L17c
            int r13 = r7.length     // Catch: java.io.IOException -> L1b8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.io.IOException -> L1b8
            goto L17e
        L17c:
            java.lang.String r13 = "null"
        L17e:
            r14 = 2
            r11[r14] = r13     // Catch: java.io.IOException -> L1b8
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch: java.io.IOException -> L1b8
            r11[r13] = r14     // Catch: java.io.IOException -> L1b8
            r13 = 4
            com.google.android.gms.internal.ads.zzapq r14 = r21.zzy()     // Catch: java.io.IOException -> L1b8
            int r14 = r14.zza()     // Catch: java.io.IOException -> L1b8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.io.IOException -> L1b8
            r11[r13] = r14     // Catch: java.io.IOException -> L1b8
            com.google.android.gms.internal.ads.zzaqo.zza(r8, r11)     // Catch: java.io.IOException -> L1b8
        L19a:
            r8 = 200(0xc8, float:2.8E-43)
            if (r12 < r8) goto L1b2
            r8 = 299(0x12b, float:4.19E-43)
            if (r12 > r8) goto L1b2
            com.google.android.gms.internal.ads.zzapy r8 = new com.google.android.gms.internal.ads.zzapy     // Catch: java.io.IOException -> L1b8
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L1b8
            long r15 = r15 - r4
            r11 = r8
            r13 = r7
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r17)     // Catch: java.io.IOException -> L1b8
            return r8
        L1b2:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.io.IOException -> L1b8
            r0.<init>()     // Catch: java.io.IOException -> L1b8
            throw r0     // Catch: java.io.IOException -> L1b8
        L1b8:
            r0 = move-exception
            r12 = r7
            goto L1c0
        L1bb:
            r0 = move-exception
            goto L1bf
        L1bd:
            r0 = move-exception
            r10 = 0
        L1bf:
            r12 = 0
        L1c0:
            boolean r7 = r0 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L1d3
            com.google.android.gms.internal.ads.zzarf r0 = new com.google.android.gms.internal.ads.zzarf
            com.google.android.gms.internal.ads.zzaqk r7 = new com.google.android.gms.internal.ads.zzaqk
            r7.<init>()
            java.lang.String r8 = "socket"
            r10 = 0
            r0.<init>(r8, r7, r10)
        L1d1:
            r7 = r0
            goto L23e
        L1d3:
            boolean r7 = r0 instanceof java.net.MalformedURLException
            if (r7 != 0) goto L287
            if (r10 == 0) goto L281
            int r0 = r10.zzb()
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r8[r9] = r7
            java.lang.String r7 = r21.zzk()
            r8[r6] = r7
            java.lang.String r7 = "Unexpected response code %d for %s"
            com.google.android.gms.internal.ads.zzaqo.zzb(r7, r8)
            if (r12 == 0) goto L230
            java.util.List r16 = r10.zzd()
            com.google.android.gms.internal.ads.zzapy r7 = new com.google.android.gms.internal.ads.zzapy
            r13 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r14 = r10 - r4
            r10 = r7
            r11 = r0
            r10.<init>(r11, r12, r13, r14, r16)
            r8 = 401(0x191, float:5.62E-43)
            if (r0 == r8) goto L222
            r8 = 403(0x193, float:5.65E-43)
            if (r0 != r8) goto L20e
            goto L222
        L20e:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L21c
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 > r2) goto L21c
            com.google.android.gms.internal.ads.zzapp r0 = new com.google.android.gms.internal.ads.zzapp
            r0.<init>(r7)
            throw r0
        L21c:
            com.google.android.gms.internal.ads.zzaqj r0 = new com.google.android.gms.internal.ads.zzaqj
            r0.<init>(r7)
            throw r0
        L222:
            com.google.android.gms.internal.ads.zzarf r0 = new com.google.android.gms.internal.ads.zzarf
            com.google.android.gms.internal.ads.zzapk r8 = new com.google.android.gms.internal.ads.zzapk
            r8.<init>(r7)
            java.lang.String r7 = "auth"
            r10 = 0
            r0.<init>(r7, r8, r10)
            goto L1d1
        L230:
            r10 = 0
            com.google.android.gms.internal.ads.zzarf r0 = new com.google.android.gms.internal.ads.zzarf
            com.google.android.gms.internal.ads.zzapx r7 = new com.google.android.gms.internal.ads.zzapx
            r7.<init>()
            java.lang.String r8 = "network"
            r0.<init>(r8, r7, r10)
            goto L1d1
        L23e:
            com.google.android.gms.internal.ads.zzapq r0 = r21.zzy()
            int r8 = r21.zzb()
            com.google.android.gms.internal.ads.zzaql r10 = com.google.android.gms.internal.ads.zzarf.zza(r7)     // Catch: com.google.android.gms.internal.ads.zzaql -> L267
            r0.zzc(r10)     // Catch: com.google.android.gms.internal.ads.zzaql -> L267
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r7 = com.google.android.gms.internal.ads.zzarf.zzb(r7)
            r0[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0[r6] = r7
            java.lang.String r6 = "%s-retry [timeout=%s]"
            java.lang.String r0 = java.lang.String.format(r6, r0)
            r2.zzm(r0)
            goto La
        L267:
            r0 = move-exception
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = com.google.android.gms.internal.ads.zzarf.zzb(r7)
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3[r6] = r4
            java.lang.String r4 = "%s-timeout-giveup [timeout=%s]"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.zzm(r3)
            throw r0
        L281:
            com.google.android.gms.internal.ads.zzapz r2 = new com.google.android.gms.internal.ads.zzapz
            r2.<init>(r0)
            throw r2
        L287:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r2 = r21.zzk()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r4.concat(r2)
            r3.<init>(r2, r0)
            throw r3
    }
}
