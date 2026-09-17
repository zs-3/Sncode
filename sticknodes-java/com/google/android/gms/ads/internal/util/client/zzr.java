package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzr implements com.google.android.gms.ads.internal.util.client.zze {
    private final java.lang.String zza;

    public zzr() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzr(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final boolean zza(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = ". "
            r1 = 0
            boolean r2 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            if (r2 == 0) goto Le
            r2 = 263(0x107, float:3.69E-43)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            java.lang.String r3 = "Pinging URL: "
            r2.append(r3)     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            r2.append(r7)     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            java.net.URI r2 = new java.net.URI     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            r2.<init>(r7)     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            java.net.URL r2 = r2.toURL()     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = r6.zza     // Catch: java.lang.Throwable -> L96
            r4 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L96
            r5 = 1
            r2.setInstanceFollowRedirects(r5)     // Catch: java.lang.Throwable -> L96
            r2.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L4a
            java.lang.String r4 = "User-Agent"
            r2.setRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L96
        L4a:
            r2.setUseCaches(r1)     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.ads.internal.util.client.zzl r3 = new com.google.android.gms.ads.internal.util.client.zzl     // Catch: java.lang.Throwable -> L96
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L96
            r3.zzc(r2, r4)     // Catch: java.lang.Throwable -> L96
            int r4 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L96
            r3.zze(r2, r4)     // Catch: java.lang.Throwable -> L96
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 < r3) goto L68
            r3 = 300(0x12c, float:4.2E-43)
            if (r4 < r3) goto L66
            goto L68
        L66:
            r1 = 1
            goto L84
        L68:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r5 = "Received non-success response code "
            r3.append(r5)     // Catch: java.lang.Throwable -> L96
            r3.append(r4)     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = " from pinging URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L96
            r3.append(r7)     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)     // Catch: java.lang.Throwable -> L96
        L84:
            r2.disconnect()     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            boolean r7 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r7 == 0) goto Le9
            goto Le6
        L8e:
            r2 = move-exception
            goto L9d
        L90:
            r2 = move-exception
            goto L9d
        L92:
            r2 = move-exception
            goto Lc2
        L94:
            r2 = move-exception
            goto Lc2
        L96:
            r3 = move-exception
            r2.disconnect()     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
            throw r3     // Catch: java.lang.RuntimeException -> L8e java.io.IOException -> L90 java.net.URISyntaxException -> L92 java.lang.IndexOutOfBoundsException -> L94 java.lang.Throwable -> L9b
        L9b:
            r7 = move-exception
            goto Lea
        L9d:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = "Error while pinging URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L9b
            r3.append(r7)     // Catch: java.lang.Throwable -> L9b
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            r3.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L9b
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r7)     // Catch: java.lang.Throwable -> L9b
            boolean r7 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r7 == 0) goto Le9
            goto Le6
        Lc2:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r3.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = "Error while parsing ping URL: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L9b
            r3.append(r7)     // Catch: java.lang.Throwable -> L9b
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            r3.append(r2)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L9b
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r7)     // Catch: java.lang.Throwable -> L9b
            boolean r7 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r7 == 0) goto Le9
        Le6:
            android.net.TrafficStats.clearThreadStatsTag()
        Le9:
            return r1
        Lea:
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto Lf3
            android.net.TrafficStats.clearThreadStatsTag()
        Lf3:
            throw r7
    }
}
