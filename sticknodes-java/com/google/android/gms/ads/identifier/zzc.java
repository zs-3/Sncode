package com.google.android.gms.ads.identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public final class zzc {
    public static final void zza(java.lang.String r6) {
            java.lang.String r0 = ". "
            java.lang.String r1 = "HttpUrlPinger"
            r2 = 263(0x107, float:3.69E-43)
            com.google.android.gms.internal.ads_identifier.zzi.zzb(r2)     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L4d
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 < r4) goto L20
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L46
        L20:
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L4d
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + 65
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = "Received non-success response code "
            r5.append(r4)     // Catch: java.lang.Throwable -> L4d
            r5.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = " from pinging URL: "
            r5.append(r3)     // Catch: java.lang.Throwable -> L4d
            r5.append(r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4d
            android.util.Log.w(r1, r3)     // Catch: java.lang.Throwable -> L4d
        L46:
            r2.disconnect()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
            com.google.android.gms.internal.ads_identifier.zzi.zza()
            return
        L4d:
            r3 = move-exception
            r2.disconnect()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
            throw r3     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54 java.io.IOException -> L56 java.lang.IndexOutOfBoundsException -> L8c
        L52:
            r6 = move-exception
            goto Lc2
        L54:
            r2 = move-exception
            goto L57
        L56:
            r2 = move-exception
        L57:
            java.lang.String r3 = r2.getMessage()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L52
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L52
            int r4 = r4 + 27
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L52
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L52
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "Error while pinging URL: "
            r5.append(r4)     // Catch: java.lang.Throwable -> L52
            r5.append(r6)     // Catch: java.lang.Throwable -> L52
            r5.append(r0)     // Catch: java.lang.Throwable -> L52
            r5.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L52
            android.util.Log.w(r1, r6, r2)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.internal.ads_identifier.zzi.zza()
            return
        L8c:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L52
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L52
            int r4 = r4 + 32
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L52
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L52
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "Error while parsing ping URL: "
            r5.append(r4)     // Catch: java.lang.Throwable -> L52
            r5.append(r6)     // Catch: java.lang.Throwable -> L52
            r5.append(r0)     // Catch: java.lang.Throwable -> L52
            r5.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r5.toString()     // Catch: java.lang.Throwable -> L52
            android.util.Log.w(r1, r6, r2)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.internal.ads_identifier.zzi.zza()
            return
        Lc2:
            com.google.android.gms.internal.ads_identifier.zzi.zza()
            throw r6
    }
}
