package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaln {
    private static final java.util.regex.Pattern zzc = null;
    private static final java.util.regex.Pattern zzd = null;
    private static final java.util.regex.Pattern zze = null;
    private static final java.util.regex.Pattern zzf = null;
    public final int zza;
    public final android.graphics.PointF zzb;

    static {
            java.lang.String r0 = "\\{([^}]*)\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzaln.zzc = r0
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "\\s*\\d+(?:\\.\\d+)?\\s*"
            r1[r2] = r3
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "\\\\pos\\((%1$s),(%1$s)\\)"
            java.lang.String r1 = java.lang.String.format(r4, r5, r1)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            com.google.android.gms.internal.ads.zzaln.zzd = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r3
            java.lang.String r1 = "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)"
            java.lang.String r0 = java.lang.String.format(r4, r1, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzaln.zze = r0
            java.lang.String r0 = "\\\\an(\\d+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzaln.zzf = r0
            return
    }

    private zzaln(int r1, android.graphics.PointF r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzaln zza(java.lang.String r12) {
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzaln.zzc
            java.util.regex.Matcher r12 = r0.matcher(r12)
            r0 = 0
            r1 = -1
            r3 = r0
            r2 = -1
        La:
            boolean r4 = r12.find()
            if (r4 == 0) goto La3
            r4 = 1
            java.lang.String r5 = r12.group(r4)
            java.util.Objects.requireNonNull(r5)
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.zzaln.zzd     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Pattern r7 = com.google.android.gms.internal.ads.zzaln.zze     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r7 = r7.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            boolean r8 = r6.find()     // Catch: java.lang.RuntimeException -> L82
            boolean r9 = r7.find()     // Catch: java.lang.RuntimeException -> L82
            r10 = 2
            if (r8 == 0) goto L55
            if (r9 == 0) goto L4c
            java.lang.String r7 = "SsaStyle.Overrides"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L82
            r8.<init>()     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            r8.append(r5)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "'"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r8 = r8.toString()     // Catch: java.lang.RuntimeException -> L82
            com.google.android.gms.internal.ads.zzea.zze(r7, r8)     // Catch: java.lang.RuntimeException -> L82
        L4c:
            java.lang.String r7 = r6.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r6 = r6.group(r10)     // Catch: java.lang.RuntimeException -> L82
            goto L62
        L55:
            if (r9 == 0) goto L7e
            java.lang.String r6 = r7.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r7 = r7.group(r10)     // Catch: java.lang.RuntimeException -> L82
            r11 = r7
            r7 = r6
            r6 = r11
        L62:
            android.graphics.PointF r8 = new android.graphics.PointF     // Catch: java.lang.RuntimeException -> L82
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> L82
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.RuntimeException -> L82
            java.util.Objects.requireNonNull(r6)
            java.lang.String r6 = r6.trim()     // Catch: java.lang.RuntimeException -> L82
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.RuntimeException -> L82
            r8.<init>(r7, r6)     // Catch: java.lang.RuntimeException -> L82
            goto L7f
        L7e:
            r8 = r0
        L7f:
            if (r8 == 0) goto L82
            r3 = r8
        L82:
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.zzaln.zzf     // Catch: java.lang.RuntimeException -> La0
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> La0
            boolean r6 = r5.find()     // Catch: java.lang.RuntimeException -> La0
            if (r6 == 0) goto L9a
            java.lang.String r4 = r5.group(r4)     // Catch: java.lang.RuntimeException -> La0
            java.util.Objects.requireNonNull(r4)
            int r4 = com.google.android.gms.internal.ads.zzalo.zza(r4)     // Catch: java.lang.RuntimeException -> La0
            goto L9b
        L9a:
            r4 = -1
        L9b:
            if (r4 == r1) goto La
            r2 = r4
            goto La
        La0:
            goto La
        La3:
            com.google.android.gms.internal.ads.zzaln r12 = new com.google.android.gms.internal.ads.zzaln
            r12.<init>(r2, r3)
            return r12
    }

    public static java.lang.String zzb(java.lang.String r1) {
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzaln.zzc
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            return r1
    }
}
