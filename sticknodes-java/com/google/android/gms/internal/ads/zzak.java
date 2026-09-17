package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzak {
    public final java.lang.String zza;
    public final java.lang.String zzb;

    static {
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            return
    }

    public zzak(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeu.zzD(r1)
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<com.google.android.gms.internal.ads.zzak> r2 = com.google.android.gms.internal.ads.zzak.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            com.google.android.gms.internal.ads.zzak r5 = (com.google.android.gms.internal.ads.zzak) r5
            java.lang.String r2 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L27
            java.lang.String r2 = r4.zzb
            java.lang.String r5 = r5.zzb
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zzb
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.zza
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }
}
