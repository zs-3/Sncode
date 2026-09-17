package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbc {
    public final java.lang.String zza;
    public final com.google.android.gms.internal.ads.zzax zzb;
    public final com.google.android.gms.internal.ads.zzav zzc;
    public final com.google.android.gms.internal.ads.zzbh zzd;
    public final com.google.android.gms.internal.ads.zzap zze;
    public final com.google.android.gms.internal.ads.zzaz zzf;

    static {
            com.google.android.gms.internal.ads.zzam r0 = new com.google.android.gms.internal.ads.zzam
            r0.<init>()
            r0.zzc()
            r0 = 0
            r1 = 36
            java.lang.Integer.toString(r0, r1)
            r0 = 1
            java.lang.Integer.toString(r0, r1)
            r0 = 2
            java.lang.Integer.toString(r0, r1)
            r0 = 3
            java.lang.Integer.toString(r0, r1)
            r0 = 4
            java.lang.Integer.toString(r0, r1)
            r0 = 5
            java.lang.Integer.toString(r0, r1)
            return
    }

    /* synthetic */ zzbc(java.lang.String r1, com.google.android.gms.internal.ads.zzar r2, com.google.android.gms.internal.ads.zzax r3, com.google.android.gms.internal.ads.zzav r4, com.google.android.gms.internal.ads.zzbh r5, com.google.android.gms.internal.ads.zzaz r6, com.google.android.gms.internal.ads.zzbb r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r2
            r0.zzf = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzbc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzbc r5 = (com.google.android.gms.internal.ads.zzbc) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.gms.internal.ads.zzap r1 = r4.zze
            com.google.android.gms.internal.ads.zzap r3 = r5.zze
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
            com.google.android.gms.internal.ads.zzax r1 = r4.zzb
            com.google.android.gms.internal.ads.zzax r3 = r5.zzb
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.gms.internal.ads.zzav r1 = r4.zzc
            com.google.android.gms.internal.ads.zzav r3 = r5.zzc
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.gms.internal.ads.zzbh r1 = r4.zzd
            com.google.android.gms.internal.ads.zzbh r3 = r5.zzd
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L49
            com.google.android.gms.internal.ads.zzaz r1 = r4.zzf
            com.google.android.gms.internal.ads.zzaz r5 = r5.zzf
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L49
            return r0
        L49:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zza
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.google.android.gms.internal.ads.zzax r1 = r2.zzb
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.android.gms.internal.ads.zzav r1 = r2.zzc
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.android.gms.internal.ads.zzap r1 = r2.zze
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.android.gms.internal.ads.zzbh r1 = r2.zzd
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            return r0
    }
}
