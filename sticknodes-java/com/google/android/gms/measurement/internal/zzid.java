package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzid implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzif zza;

    zzid(com.google.android.gms.measurement.internal.zzif r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int r4, java.lang.String r5, java.util.List r6, boolean r7, boolean r8) {
            r3 = this;
            int r4 = r4 + (-1)
            r0 = 3
            r1 = 1
            if (r4 == 0) goto L7e
            if (r4 == r1) goto L53
            if (r4 == r0) goto L46
            r2 = 4
            if (r4 == r2) goto L1b
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzi()
            goto L8a
        L1b:
            if (r7 == 0) goto L2a
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzm()
            goto L8a
        L2a:
            if (r8 != 0) goto L39
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzl()
            goto L8a
        L39:
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            goto L8a
        L46:
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            goto L8a
        L53:
            if (r7 == 0) goto L62
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzh()
            goto L8a
        L62:
            if (r8 != 0) goto L71
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzf()
            goto L8a
        L71:
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            goto L8a
        L7e:
            com.google.android.gms.measurement.internal.zzif r4 = r3.zza
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzd()
        L8a:
            int r7 = r6.size()
            r8 = 0
            if (r7 == r1) goto Lb6
            r2 = 2
            if (r7 == r2) goto Laa
            if (r7 == r0) goto L9a
            r4.zza(r5)
            return
        L9a:
            java.lang.Object r7 = r6.get(r8)
            java.lang.Object r8 = r6.get(r1)
            java.lang.Object r6 = r6.get(r2)
            r4.zzd(r5, r7, r8, r6)
            return
        Laa:
            java.lang.Object r7 = r6.get(r8)
            java.lang.Object r6 = r6.get(r1)
            r4.zzc(r5, r7, r6)
            return
        Lb6:
            java.lang.Object r6 = r6.get(r8)
            r4.zzb(r5, r6)
            return
    }
}
