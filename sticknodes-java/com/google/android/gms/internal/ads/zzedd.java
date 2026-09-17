package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzedd implements com.google.android.gms.internal.ads.zzfkj {
    protected final android.content.Context zza;
    protected final java.lang.String zzb;

    public zzedd(android.content.Context r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbwi r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfkj
    public final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            com.google.android.gms.internal.ads.zzedb r1 = (com.google.android.gms.internal.ads.zzedb) r1
            com.google.android.gms.internal.ads.zzedc r1 = r0.zzb(r1)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzedc zzb(com.google.android.gms.internal.ads.zzedb r9) throws com.google.android.gms.internal.ads.zzdye {
            r8 = this;
            java.lang.String r1 = r9.zza
            int r2 = r9.zzb
            java.util.Map r3 = r9.zzc
            byte[] r4 = r9.zzd
            java.lang.String r5 = r9.zze
            com.google.android.gms.common.util.Clock r9 = com.google.android.gms.ads.internal.zzu.zzB()
            long r6 = r9.elapsedRealtime()
            r0 = r8
            com.google.android.gms.internal.ads.zzedc r9 = r0.zzc(r1, r2, r3, r4, r5, r6)
            return r9
    }

    protected final com.google.android.gms.internal.ads.zzedc zzc(java.lang.String r17, int r18, java.util.Map r19, byte[] r20, java.lang.String r21, long r22) throws com.google.android.gms.internal.ads.zzdye {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r20
            java.lang.String r3 = "Received error HTTP response code: "
            r4 = 1
            com.google.android.gms.internal.ads.zzedc r5 = new com.google.android.gms.internal.ads.zzedc     // Catch: java.io.IOException -> L21e
            r5.<init>()     // Catch: java.io.IOException -> L21e
            java.lang.String r6 = r1.zzb     // Catch: java.io.IOException -> L21e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L21e
            r7.<init>()     // Catch: java.io.IOException -> L21e
            java.lang.String r8 = "SDK version: "
            r7.append(r8)     // Catch: java.io.IOException -> L21e
            r7.append(r6)     // Catch: java.io.IOException -> L21e
            java.lang.String r6 = r7.toString()     // Catch: java.io.IOException -> L21e
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r6)     // Catch: java.io.IOException -> L21e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L21e
            r6.<init>()     // Catch: java.io.IOException -> L21e
            java.lang.String r7 = "AdRequestServiceImpl: Sending request: "
            r6.append(r7)     // Catch: java.io.IOException -> L21e
            r6.append(r0)     // Catch: java.io.IOException -> L21e
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L21e
            com.google.android.gms.ads.internal.util.client.zzm.zze(r6)     // Catch: java.io.IOException -> L21e
            java.net.URL r6 = new java.net.URL     // Catch: java.io.IOException -> L21e
            r6.<init>(r0)     // Catch: java.io.IOException -> L21e
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.io.IOException -> L21e
            r0.<init>()     // Catch: java.io.IOException -> L21e
            r7 = 0
        L43:
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.io.IOException -> L21e
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.io.IOException -> L21e
            com.google.android.gms.ads.internal.util.zzt r8 = com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            android.content.Context r9 = r1.zza     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r10 = r1.zzb     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r11 = 0
            r13 = 0
            r12 = r6
            r14 = r18
            r8.zzf(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.Set r8 = r19.entrySet()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L61:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r9 == 0) goto L7d
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r6.addRequestProperty(r10, r9)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            goto L61
        L7d:
            boolean r8 = android.text.TextUtils.isEmpty(r21)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r8 != 0) goto L8b
            java.lang.String r8 = "Content-Type"
            r9 = r21
            r6.setRequestProperty(r8, r9)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            goto L8d
        L8b:
            r9 = r21
        L8d:
            int r8 = r2.length     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r10 = 0
            if (r8 <= 0) goto Laf
            r6.setDoOutput(r4)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r6.setFixedLengthStreamingMode(r8)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Laa
            java.io.OutputStream r11 = r6.getOutputStream()     // Catch: java.lang.Throwable -> Laa
            r8.<init>(r11)     // Catch: java.lang.Throwable -> Laa
            r8.write(r2)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.common.util.IOUtils.closeQuietly(r8)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            goto Laf
        La7:
            r0 = move-exception
            r10 = r8
            goto Lab
        Laa:
            r0 = move-exception
        Lab:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r10)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            throw r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        Laf:
            com.google.android.gms.ads.internal.util.client.zzl r8 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r8.zzc(r6, r2)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            int r11 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.Map r12 = r6.getHeaderFields()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.Set r12 = r12.entrySet()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        Lc7:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r13 == 0) goto Lf8
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Object r14 = r13.getKey()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            boolean r15 = r0.containsKey(r14)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r15 == 0) goto Lef
            java.lang.Object r14 = r0.get(r14)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r14.addAll(r13)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            goto Lc7
        Lef:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r15.<init>(r13)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r0.put(r14, r15)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            goto Lc7
        Lf8:
            r8.zze(r6, r11)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r5.zza = r11     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r5.zzb = r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r12 = ""
            r5.zzc = r12     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r12 = 200(0xc8, float:2.8E-43)
            r13 = 300(0x12c, float:4.2E-43)
            if (r11 < r12) goto L15c
            if (r11 >= r13) goto L15c
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L157
            java.io.InputStream r0 = r6.getInputStream()     // Catch: java.lang.Throwable -> L157
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L157
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L154
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.zzN(r2)     // Catch: java.lang.Throwable -> L154
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r8.zzg(r0)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r5.zzc = r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r0 == 0) goto L143
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfn     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r0 == 0) goto L13c
            goto L143
        L13c:
            com.google.android.gms.internal.ads.zzdye r0 = new com.google.android.gms.internal.ads.zzdye     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r2 = 3
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            throw r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L143:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            long r2 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            long r2 = r2 - r22
            r5.zzd = r2     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L14f:
            r6.disconnect()     // Catch: java.io.IOException -> L21e
            goto L218
        L154:
            r0 = move-exception
            r10 = r2
            goto L158
        L157:
            r0 = move-exception
        L158:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r10)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            throw r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L15c:
            if (r11 < r13) goto L1ce
            r8 = 400(0x190, float:5.6E-43)
            if (r11 >= r8) goto L1ce
            java.lang.String r8 = "Location"
            java.lang.String r8 = r6.getHeaderField(r8)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r10 != 0) goto L1c1
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzhu     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Object r10 = r11.zza(r10)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r10 == 0) goto L195
            java.net.URI r10 = new java.net.URI     // Catch: java.net.URISyntaxException -> L18a java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r10.<init>(r8)     // Catch: java.net.URISyntaxException -> L18a java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.net.URL r8 = r10.toURL()     // Catch: java.net.URISyntaxException -> L18a java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            goto L19b
        L18a:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzdye r2 = new com.google.android.gms.internal.ads.zzdye     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r2.<init>(r4, r3, r0)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            throw r2     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L195:
            java.net.URL r10 = new java.net.URL     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r8 = r10
        L19b:
            int r7 = r7 + r4
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zzeT     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Object r10 = r11.zza(r10)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            if (r7 > r10) goto L1b4
            r6.disconnect()     // Catch: java.io.IOException -> L21e
            r6 = r8
            goto L43
        L1b4:
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            com.google.android.gms.internal.ads.zzdye r0 = new com.google.android.gms.internal.ads.zzdye     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r2 = "Too many redirects"
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            throw r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L1c1:
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            com.google.android.gms.internal.ads.zzdye r0 = new com.google.android.gms.internal.ads.zzdye     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r2 = "No location header to follow redirect"
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            throw r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L1ce:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r0.<init>()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r0.append(r3)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r0.append(r11)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            com.google.android.gms.internal.ads.zzdye r0 = new com.google.android.gms.internal.ads.zzdye     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r2.<init>()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r2.append(r3)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r2.append(r11)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
            throw r0     // Catch: java.lang.Throwable -> L1f5 com.google.android.gms.internal.ads.zzdye -> L1f7
        L1f5:
            r0 = move-exception
            goto L21a
        L1f7:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzhU     // Catch: java.lang.Throwable -> L1f5
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L1f5
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L1f5
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1f5
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1f5
            if (r2 == 0) goto L219
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L1f5
            long r2 = r0.elapsedRealtime()     // Catch: java.lang.Throwable -> L1f5
            long r2 = r2 - r22
            r5.zzd = r2     // Catch: java.lang.Throwable -> L1f5
            goto L14f
        L218:
            return r5
        L219:
            throw r0     // Catch: java.lang.Throwable -> L1f5
        L21a:
            r6.disconnect()     // Catch: java.io.IOException -> L21e
            throw r0     // Catch: java.io.IOException -> L21e
        L21e:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Error while connecting to ad server: "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
            com.google.android.gms.internal.ads.zzdye r3 = new com.google.android.gms.internal.ads.zzdye
            r3.<init>(r4, r2, r0)
            throw r3
    }
}
