package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaqz {
    public static long zza(java.lang.String r5) {
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.text.SimpleDateFormat r0 = zzd(r0)     // Catch: java.text.ParseException -> Lf
            java.util.Date r0 = r0.parse(r5)     // Catch: java.text.ParseException -> Lf
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r5)
            java.lang.String r2 = "Unable to parse dateStr: %s, falling back to 0"
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L2d
            java.lang.String r1 = "-1"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L25
            goto L2d
        L25:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r5
            com.google.android.gms.internal.ads.zzaqo.zzc(r0, r2, r1)
            goto L34
        L2d:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            com.google.android.gms.internal.ads.zzaqo.zzd(r2, r0)
        L34:
            r0 = 0
            return r0
    }

    public static com.google.android.gms.internal.ads.zzapl zzb(com.google.android.gms.internal.ads.zzapy r20) {
            r0 = r20
            long r1 = java.lang.System.currentTimeMillis()
            java.util.Map r3 = r0.zzc
            if (r3 != 0) goto Lc
            goto L86
        Lc:
            java.lang.String r4 = "Date"
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L1b
            long r7 = zza(r4)
            goto L1d
        L1b:
            r7 = 0
        L1d:
            java.lang.String r4 = "Cache-Control"
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r10 = 0
            if (r4 == 0) goto L8b
            java.lang.String r11 = ","
            java.lang.String[] r4 = r4.split(r11, r10)
            r11 = 0
            r12 = 0
            r14 = 0
        L33:
            int r9 = r4.length
            if (r10 >= r9) goto L88
            r9 = r4[r10]
            java.lang.String r9 = r9.trim()
            java.lang.String r5 = "no-cache"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L86
            java.lang.String r5 = "no-store"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L86
            java.lang.String r5 = "max-age="
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L5f
            r5 = 8
            java.lang.String r5 = r9.substring(r5)     // Catch: java.lang.Exception -> L83
            long r14 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L83
            goto L83
        L5f:
            java.lang.String r5 = "stale-while-revalidate="
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L72
            r5 = 23
            java.lang.String r5 = r9.substring(r5)     // Catch: java.lang.Exception -> L83
            long r12 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L83
            goto L83
        L72:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r9.equals(r5)
            if (r5 != 0) goto L82
            java.lang.String r5 = "proxy-revalidate"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L83
        L82:
            r11 = 1
        L83:
            int r10 = r10 + 1
            goto L33
        L86:
            r0 = 0
            return r0
        L88:
            r10 = r11
            r9 = 1
            goto L90
        L8b:
            r9 = 0
            r12 = 0
            r14 = 0
        L90:
            java.lang.String r4 = "Expires"
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L9f
            long r4 = zza(r4)
            goto La1
        L9f:
            r4 = 0
        La1:
            java.lang.String r6 = "Last-Modified"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto Lb2
            long r16 = zza(r6)
            r18 = r16
            goto Lb4
        Lb2:
            r18 = 0
        Lb4:
            java.lang.String r6 = "ETag"
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r9 == 0) goto Lcf
            r4 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r4
            long r1 = r1 + r14
            if (r10 == 0) goto Lc7
            r12 = r1
            goto Lcd
        Lc7:
            java.lang.Long.signum(r12)
            long r12 = r12 * r4
            long r12 = r12 + r1
        Lcd:
            r9 = r12
            goto Lde
        Lcf:
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto Ldd
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 < 0) goto Ldd
            long r4 = r4 - r7
            long r1 = r1 + r4
            r9 = r1
            goto Lde
        Ldd:
            r1 = r9
        Lde:
            com.google.android.gms.internal.ads.zzapl r4 = new com.google.android.gms.internal.ads.zzapl
            r4.<init>()
            byte[] r5 = r0.zzb
            r4.zza = r5
            r4.zzb = r6
            r4.zzf = r1
            r4.zze = r9
            r4.zzc = r7
            r1 = r18
            r4.zzd = r1
            r4.zzg = r3
            java.util.List r0 = r0.zzd
            r4.zzh = r0
            return r4
    }

    static java.lang.String zzc(long r2) {
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss 'GMT'"
            java.text.SimpleDateFormat r0 = zzd(r0)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            java.lang.String r2 = r0.format(r1)
            return r2
    }

    private static java.text.SimpleDateFormat zzd(java.lang.String r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r2, r1)
            java.lang.String r2 = "GMT"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            r0.setTimeZone(r2)
            return r0
    }
}
