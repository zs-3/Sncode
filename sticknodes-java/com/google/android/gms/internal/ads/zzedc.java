package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzedc {
    public int zza;
    public java.util.Map zzb;
    public java.lang.String zzc;
    public long zzd;

    public zzedc() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzb = r0
            java.lang.String r0 = ""
            r2.zzc = r0
            r0 = -1
            r2.zzd = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzedc zza(java.io.Reader r8) throws com.google.android.gms.internal.ads.zzfgl {
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r1.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r2 = -1
            java.lang.String r4 = ""
            r0.beginObject()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r5 = 0
        L12:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            if (r6 == 0) goto L6d
            java.lang.String r6 = r0.nextName()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            java.lang.String r7 = "response"
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            if (r7 == 0) goto L29
            int r5 = r0.nextInt()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            goto L12
        L29:
            java.lang.String r7 = "body"
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            if (r7 == 0) goto L36
            java.lang.String r4 = r0.nextString()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            goto L12
        L36:
            java.lang.String r7 = "latency"
            boolean r7 = r7.equals(r6)     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            if (r7 == 0) goto L43
            long r2 = r0.nextLong()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            goto L12
        L43:
            java.lang.String r7 = "headers"
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            if (r6 == 0) goto L69
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r1.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r0.beginObject()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
        L53:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            if (r6 == 0) goto L65
            java.lang.String r6 = r0.nextName()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            java.util.List r7 = com.google.android.gms.ads.internal.util.zzbs.zzd(r0)     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            goto L53
        L65:
            r0.endObject()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            goto L12
        L69:
            r0.skipValue()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            goto L12
        L6d:
            r0.endObject()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            com.google.android.gms.internal.ads.zzedc r0 = new com.google.android.gms.internal.ads.zzedc     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r0.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r0.zza = r5     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            if (r4 == 0) goto L7b
            r0.zzc = r4     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
        L7b:
            r0.zzd = r2     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            r0.zzb = r1     // Catch: java.lang.Throwable -> L83 java.lang.AssertionError -> L85 java.lang.NumberFormatException -> L87 java.lang.IllegalStateException -> L89 java.io.IOException -> L8b
            com.google.android.gms.common.util.IOUtils.closeQuietly(r8)
            return r0
        L83:
            r0 = move-exception
            goto L94
        L85:
            r0 = move-exception
            goto L8c
        L87:
            r0 = move-exception
            goto L8c
        L89:
            r0 = move-exception
            goto L8c
        L8b:
            r0 = move-exception
        L8c:
            com.google.android.gms.internal.ads.zzfgl r1 = new com.google.android.gms.internal.ads.zzfgl     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "Unable to parse Response"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L83
            throw r1     // Catch: java.lang.Throwable -> L83
        L94:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r8)
            throw r0
    }
}
