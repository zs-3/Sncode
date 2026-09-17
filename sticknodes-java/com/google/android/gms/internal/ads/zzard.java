package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzard extends com.google.android.gms.internal.ads.zzaqq {
    public zzard() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzard(com.google.android.gms.internal.ads.zzarc r1, javax.net.ssl.SSLSocketFactory r2) {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.List zzb(java.util.Map r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L11:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            if (r2 == 0) goto L11
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.ads.zzapu r4 = new com.google.android.gms.internal.ads.zzapu
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L2d
        L48:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaqq
    public final com.google.android.gms.internal.ads.zzara zza(com.google.android.gms.internal.ads.zzaqc r9, java.util.Map r10) throws java.io.IOException, com.google.android.gms.internal.ads.zzapk {
            r8 = this;
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = r9.zzk()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r2.putAll(r10)
            java.util.Map r10 = r9.zzl()
            r2.putAll(r10)
            java.net.URL r10 = new java.net.URL
            r10.<init>(r1)
            java.net.URLConnection r1 = r10.openConnection()
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            boolean r3 = java.net.HttpURLConnection.getFollowRedirects()
            r1.setInstanceFollowRedirects(r3)
            int r3 = r9.zzb()
            r1.setConnectTimeout(r3)
            r1.setReadTimeout(r3)
            r3 = 0
            r1.setUseCaches(r3)
            r4 = 1
            r1.setDoInput(r4)
            java.lang.String r10 = r10.getProtocol()
            java.lang.String r5 = "https"
            r5.equals(r10)
            java.lang.String r10 = "application/x-www-form-urlencoded; charset=UTF-8"
            java.util.Set r5 = r2.keySet()     // Catch: java.lang.Throwable -> Le6
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Le6
        L4c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Le6
            if (r6 == 0) goto L62
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r7 = r2.get(r6)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Le6
            r1.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> Le6
            goto L4c
        L62:
            int r2 = r9.zza()     // Catch: java.lang.Throwable -> Le6
            if (r2 == 0) goto L93
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> Le6
            byte[] r2 = r9.zzx()     // Catch: java.lang.Throwable -> Le6
            if (r2 == 0) goto L98
            r1.setDoOutput(r4)     // Catch: java.lang.Throwable -> Le6
            java.util.Map r5 = r1.getRequestProperties()     // Catch: java.lang.Throwable -> Le6
            boolean r5 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> Le6
            if (r5 != 0) goto L83
            r1.setRequestProperty(r0, r10)     // Catch: java.lang.Throwable -> Le6
        L83:
            java.io.DataOutputStream r10 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Le6
            java.io.OutputStream r0 = r1.getOutputStream()     // Catch: java.lang.Throwable -> Le6
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Le6
            r10.write(r2)     // Catch: java.lang.Throwable -> Le6
            r10.close()     // Catch: java.lang.Throwable -> Le6
            goto L98
        L93:
            java.lang.String r10 = "GET"
            r1.setRequestMethod(r10)     // Catch: java.lang.Throwable -> Le6
        L98:
            int r10 = r1.getResponseCode()     // Catch: java.lang.Throwable -> Le6
            r0 = -1
            if (r10 == r0) goto Lde
            r9.zza()     // Catch: java.lang.Throwable -> Le6
            r9 = 100
            if (r10 < r9) goto Laa
            r9 = 200(0xc8, float:2.8E-43)
            if (r10 < r9) goto Lcc
        Laa:
            r9 = 204(0xcc, float:2.86E-43)
            if (r10 == r9) goto Lcc
            r9 = 304(0x130, float:4.26E-43)
            if (r10 == r9) goto Lcc
            com.google.android.gms.internal.ads.zzara r9 = new com.google.android.gms.internal.ads.zzara     // Catch: java.lang.Throwable -> Lc9
            java.util.Map r0 = r1.getHeaderFields()     // Catch: java.lang.Throwable -> Lc9
            java.util.List r0 = zzb(r0)     // Catch: java.lang.Throwable -> Lc9
            int r2 = r1.getContentLength()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.ads.zzarb r3 = new com.google.android.gms.internal.ads.zzarb     // Catch: java.lang.Throwable -> Lc9
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lc9
            r9.<init>(r10, r0, r2, r3)     // Catch: java.lang.Throwable -> Lc9
            return r9
        Lc9:
            r9 = move-exception
            r3 = 1
            goto Le7
        Lcc:
            com.google.android.gms.internal.ads.zzara r9 = new com.google.android.gms.internal.ads.zzara     // Catch: java.lang.Throwable -> Le6
            java.util.Map r2 = r1.getHeaderFields()     // Catch: java.lang.Throwable -> Le6
            java.util.List r2 = zzb(r2)     // Catch: java.lang.Throwable -> Le6
            r4 = 0
            r9.<init>(r10, r2, r0, r4)     // Catch: java.lang.Throwable -> Le6
            r1.disconnect()
            return r9
        Lde:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> Le6
            java.lang.String r10 = "Could not retrieve response code from HttpUrlConnection."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Le6
            throw r9     // Catch: java.lang.Throwable -> Le6
        Le6:
            r9 = move-exception
        Le7:
            if (r3 != 0) goto Lec
            r1.disconnect()
        Lec:
            throw r9
    }
}
