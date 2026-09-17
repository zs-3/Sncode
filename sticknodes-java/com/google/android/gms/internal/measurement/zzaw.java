package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzaw {
    final java.util.List zza;

    protected zzaw() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            return
    }

    public abstract com.google.android.gms.internal.measurement.zzap zza(java.lang.String r1, com.google.android.gms.internal.measurement.zzg r2, java.util.List r3);

    final com.google.android.gms.internal.measurement.zzap zzb(java.lang.String r3) {
            r2 = this;
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.measurement.zzbl r1 = com.google.android.gms.internal.measurement.zzh.zze(r3)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Command not implemented: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Command not supported"
            r3.<init>(r0)
            throw r3
    }
}
