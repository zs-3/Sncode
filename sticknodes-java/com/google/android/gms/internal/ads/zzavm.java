package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzavm extends com.google.android.gms.internal.ads.zzavl {
    private zzavm(android.content.Context r1, com.google.android.gms.internal.ads.zzavk r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.gms.internal.ads.zzavm zzt(android.content.Context r1, com.google.android.gms.internal.ads.zzavk r2) {
            boolean r0 = r2.zza
            com.google.android.gms.internal.ads.zzavl.zzr(r1, r0)
            com.google.android.gms.internal.ads.zzavm r0 = new com.google.android.gms.internal.ads.zzavm
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.android.gms.internal.ads.zzavm zzu(java.lang.String r1, android.content.Context r2, boolean r3) {
            com.google.android.gms.internal.ads.zzavk r3 = new com.google.android.gms.internal.ads.zzavk
            r0 = 0
            r3.<init>(r1, r0)
            com.google.android.gms.internal.ads.zzavm r1 = zzt(r2, r3)
            return r1
    }

    @java.lang.Deprecated
    public static com.google.android.gms.internal.ads.zzavm zzv(java.lang.String r0, android.content.Context r1, boolean r2, int r3) {
            com.google.android.gms.internal.ads.zzavk r3 = new com.google.android.gms.internal.ads.zzavk
            r3.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzavm r0 = zzt(r1, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    protected final java.util.List zzp(com.google.android.gms.internal.ads.zzawo r9, android.content.Context r10, com.google.android.gms.internal.ads.zzasm r11, com.google.android.gms.internal.ads.zzasc r12) {
            r8 = this;
            java.util.concurrent.ExecutorService r12 = r9.zzk()
            r0 = 0
            if (r12 == 0) goto L30
            com.google.android.gms.internal.ads.zzavk r12 = r8.zzu
            boolean r12 = r12.zza
            if (r12 != 0) goto Le
            goto L30
        Le:
            int r6 = r9.zza()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r10 = super.zzp(r9, r10, r11, r0)
            r12.addAll(r10)
            com.google.android.gms.internal.ads.zzaxg r10 = new com.google.android.gms.internal.ads.zzaxg
            r7 = 24
            java.lang.String r3 = "bxhlS+byKsEaHbhXEyi6TD/EqtsG2sd2GfInhSI7yciYukoqPk/w1i7LSDrcmmYr"
            java.lang.String r4 = "gWtAtoadyS/0GQFYvFINsjkt4bRjT5fE+w3tC36yAJU="
            r1 = r10
            r2 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.add(r10)
            return r12
        L30:
            java.util.List r9 = super.zzp(r9, r10, r11, r0)
            return r9
    }
}
