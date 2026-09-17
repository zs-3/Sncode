package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzaq implements com.google.android.gms.internal.measurement.zzap {
    private final java.lang.String zza;
    private final java.util.ArrayList zzb;

    public zzaq(java.lang.String r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzb = r1
            r1.addAll(r2)
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzaq
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.gms.internal.measurement.zzaq r4 = (com.google.android.gms.internal.measurement.zzaq) r4
            java.lang.String r0 = r3.zza
            if (r0 == 0) goto L19
            java.lang.String r2 = r4.zza
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1e
            goto L1d
        L19:
            java.lang.String r0 = r4.zza
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r0 = r3.zzb
            java.util.ArrayList r4 = r4.zzb
            boolean r4 = r0.equals(r4)
            return r4
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zza
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            java.util.ArrayList r1 = r2.zzb
            int r0 = r0 * 31
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.util.ArrayList zzc() {
            r1 = this;
            java.util.ArrayList r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzcz(java.lang.String r1, com.google.android.gms.internal.measurement.zzg r2, java.util.List r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Statement is not an evaluated entity"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r0 = this;
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Boolean zzg() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Statement cannot be cast as Boolean"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.Double zzh() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Statement cannot be cast as Double"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final java.lang.String zzi() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Statement cannot be cast as String"
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
