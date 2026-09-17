package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzag implements com.google.android.gms.internal.measurement.zzap {
    private final com.google.android.gms.internal.measurement.zzap zza;
    private final java.lang.String zzb;

    public zzag() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            r1.zza = r0
            java.lang.String r0 = "return"
            r1.zzb = r0
            return
    }

    public zzag(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.measurement.zzap r0 = com.google.android.gms.internal.measurement.zzap.zzf
            r1.zza = r0
            r1.zzb = r2
            return
    }

    public zzag(java.lang.String r1, com.google.android.gms.internal.measurement.zzap r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            r0.zzb = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.zzag
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = r4.zzb
            com.google.android.gms.internal.measurement.zzag r5 = (com.google.android.gms.internal.measurement.zzag) r5
            java.lang.String r3 = r5.zzb
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            com.google.android.gms.internal.measurement.zzap r1 = r4.zza
            com.google.android.gms.internal.measurement.zzap r5 = r5.zza
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zzb
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            com.google.android.gms.internal.measurement.zzap r1 = r2.zza
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzap zzb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzap r0 = r1.zza
            return r0
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r1, com.google.android.gms.internal.measurement.zzg r2, java.util.List r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Control does not have functions"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzag r0 = new com.google.android.gms.internal.measurement.zzag
            com.google.android.gms.internal.measurement.zzap r1 = r3.zza
            java.lang.String r2 = r3.zzb
            com.google.android.gms.internal.measurement.zzap r1 = r1.zzd()
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Control is not a boolean"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Control is not a double"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Control is not a String"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.util.Iterator zzl() {
            r1 = this;
            r0 = 0
            return r0
    }
}
