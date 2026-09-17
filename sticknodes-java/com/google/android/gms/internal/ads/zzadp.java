package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadp {
    private static final java.util.regex.Pattern zzc = null;
    public int zza;
    public int zzb;

    static {
            java.lang.String r0 = "^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzadp.zzc = r0
            return
    }

    public zzadp() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zza = r0
            r1.zzb = r0
            return
    }

    private final boolean zzc(java.lang.String r5) {
            r4 = this;
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzadp.zzc
            java.util.regex.Matcher r5 = r0.matcher(r5)
            boolean r0 = r5.find()
            if (r0 == 0) goto L2b
            r0 = 1
            java.lang.String r1 = r5.group(r0)     // Catch: java.lang.NumberFormatException -> L2b
            int r2 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.NumberFormatException -> L2b
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch: java.lang.NumberFormatException -> L2b
            r3 = 2
            java.lang.String r5 = r5.group(r3)     // Catch: java.lang.NumberFormatException -> L2b
            int r5 = java.lang.Integer.parseInt(r5, r2)     // Catch: java.lang.NumberFormatException -> L2b
            if (r1 > 0) goto L26
            if (r5 <= 0) goto L2b
        L26:
            r4.zza = r1     // Catch: java.lang.NumberFormatException -> L2b
            r4.zzb = r5     // Catch: java.lang.NumberFormatException -> L2b
            return r0
        L2b:
            r5 = 0
            return r5
    }

    public final boolean zza() {
            r2 = this;
            int r0 = r2.zza
            r1 = -1
            if (r0 == r1) goto Lb
            int r0 = r2.zzb
            if (r0 == r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzbk r8) {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.zza()
            if (r1 >= r2) goto L4b
            com.google.android.gms.internal.ads.zzbj r2 = r8.zzb(r1)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzagp
            java.lang.String r4 = "iTunSMPB"
            r5 = 1
            if (r3 == 0) goto L27
            com.google.android.gms.internal.ads.zzagp r2 = (com.google.android.gms.internal.ads.zzagp) r2
            java.lang.String r3 = r2.zzb
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L48
            java.lang.String r2 = r2.zzc
            boolean r2 = r7.zzc(r2)
            if (r2 != 0) goto L26
            goto L48
        L26:
            return r5
        L27:
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzagy
            if (r3 == 0) goto L48
            com.google.android.gms.internal.ads.zzagy r2 = (com.google.android.gms.internal.ads.zzagy) r2
            java.lang.String r3 = r2.zza
            java.lang.String r6 = "com.apple.iTunes"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L48
            java.lang.String r3 = r2.zzb
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L48
            java.lang.String r2 = r2.zzc
            boolean r2 = r7.zzc(r2)
            if (r2 == 0) goto L48
            return r5
        L48:
            int r1 = r1 + 1
            goto L2
        L4b:
            return r0
    }
}
