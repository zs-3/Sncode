package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhd {
    private static final java.util.regex.Pattern zza = null;
    private static final java.util.regex.Pattern zzb = null;

    static {
            java.lang.String r0 = "bytes (\\d+)-(\\d+)/(?:\\d+|\\*)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzhd.zza = r0
            java.lang.String r0 = "bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzhd.zzb = r0
            return
    }

    public static long zza(java.lang.String r9, java.lang.String r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = -1
            java.lang.String r3 = "HttpUtil"
            java.lang.String r4 = "]"
            if (r0 != 0) goto L28
            long r1 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> L11
            goto L28
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Unexpected Content-Length ["
            r0.append(r5)
            r0.append(r9)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzea.zzc(r3, r0)
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L9e
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzhd.zza
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r5 = r0.matches()
            if (r5 == 0) goto L9e
            r5 = 2
            java.lang.String r5 = r0.group(r5)     // Catch: java.lang.NumberFormatException -> L87
            java.util.Objects.requireNonNull(r5)
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L87
            r7 = 1
            java.lang.String r0 = r0.group(r7)     // Catch: java.lang.NumberFormatException -> L87
            java.util.Objects.requireNonNull(r0)
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L87
            long r5 = r5 - r7
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r7 = 1
            long r5 = r5 + r7
            if (r0 >= 0) goto L5e
            r1 = r5
            goto L9e
        L5e:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L9e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L87
            r0.<init>()     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r7 = "Inconsistent headers ["
            r0.append(r7)     // Catch: java.lang.NumberFormatException -> L87
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r9 = "] ["
            r0.append(r9)     // Catch: java.lang.NumberFormatException -> L87
            r0.append(r10)     // Catch: java.lang.NumberFormatException -> L87
            r0.append(r4)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r9 = r0.toString()     // Catch: java.lang.NumberFormatException -> L87
            com.google.android.gms.internal.ads.zzea.zzf(r3, r9)     // Catch: java.lang.NumberFormatException -> L87
            long r9 = java.lang.Math.max(r1, r5)     // Catch: java.lang.NumberFormatException -> L87
            r1 = r9
            goto L9e
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unexpected Content-Range ["
            r9.append(r0)
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.internal.ads.zzea.zzc(r3, r9)
        L9e:
            return r1
    }

    public static long zzb(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto L20
        L7:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzhd.zzb
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r0 = r2.matches()
            if (r0 == 0) goto L20
            r0 = 1
            java.lang.String r2 = r2.group(r0)
            java.util.Objects.requireNonNull(r2)
            long r0 = java.lang.Long.parseLong(r2)
            return r0
        L20:
            r0 = -1
            return r0
    }
}
