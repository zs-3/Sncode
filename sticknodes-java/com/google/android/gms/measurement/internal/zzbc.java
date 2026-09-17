package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzbc {
    final java.lang.String zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final long zzd;
    final long zze;
    final com.google.android.gms.measurement.internal.zzbf zzf;

    zzbc(com.google.android.gms.measurement.internal.zzio r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, long r9, android.os.Bundle r11) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            r2.zza = r5
            r2.zzb = r6
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 1
            if (r0 != r6) goto L15
            r4 = 0
        L15:
            r2.zzc = r4
            r2.zzd = r7
            r2.zze = r9
            r0 = 0
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L36
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L36
            com.google.android.gms.measurement.internal.zzhe r4 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            java.lang.String r6 = "Event created with reverse previous/current timestamps. appId"
            r4.zzb(r6, r5)
        L36:
            if (r11 == 0) goto L9f
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L9f
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r11)
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L99
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L6a
            com.google.android.gms.measurement.internal.zzhe r6 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()
            java.lang.String r7 = "Param name can't be null"
            r6.zza(r7)
            r5.remove()
            goto L4b
        L6a:
            com.google.android.gms.measurement.internal.zzqf r7 = r3.zzw()
            java.lang.Object r8 = r4.get(r6)
            java.lang.Object r7 = r7.zzD(r6, r8)
            if (r7 != 0) goto L91
            com.google.android.gms.measurement.internal.zzhe r7 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzk()
            com.google.android.gms.measurement.internal.zzgx r8 = r3.zzj()
            java.lang.String r6 = r8.zze(r6)
            java.lang.String r8 = "Param value can't be null"
            r7.zzb(r8, r6)
            r5.remove()
            goto L4b
        L91:
            com.google.android.gms.measurement.internal.zzqf r8 = r3.zzw()
            r8.zzS(r4, r6, r7)
            goto L4b
        L99:
            com.google.android.gms.measurement.internal.zzbf r3 = new com.google.android.gms.measurement.internal.zzbf
            r3.<init>(r4)
            goto La9
        L9f:
            com.google.android.gms.measurement.internal.zzbf r3 = new com.google.android.gms.measurement.internal.zzbf
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r3.<init>(r4)
        La9:
            r2.zzf = r3
            return
    }

    private zzbc(com.google.android.gms.measurement.internal.zzio r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, long r9, com.google.android.gms.measurement.internal.zzbf r11) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            r2.zza = r5
            r2.zzb = r6
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            if (r1 != r0) goto L18
            r4 = 0
        L18:
            r2.zzc = r4
            r2.zzd = r7
            r2.zze = r9
            r0 = 0
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L3d
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L3d
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzhe.zzn(r5)
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzhe.zzn(r6)
            java.lang.String r6 = "Event created with reverse previous/current timestamps. appId, name"
            r3.zzc(r6, r4, r5)
        L3d:
            r2.zzf = r11
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.measurement.internal.zzbf r0 = r3.zzf
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event{appId='"
            r1.append(r2)
            java.lang.String r2 = r3.zza
            r1.append(r2)
            java.lang.String r2 = "', name='"
            r1.append(r2)
            java.lang.String r2 = r3.zzb
            r1.append(r2)
            java.lang.String r2 = "', params="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    final com.google.android.gms.measurement.internal.zzbc zza(com.google.android.gms.measurement.internal.zzio r12, long r13) {
            r11 = this;
            com.google.android.gms.measurement.internal.zzbf r9 = r11.zzf
            java.lang.String r2 = r11.zzc
            java.lang.String r3 = r11.zza
            java.lang.String r4 = r11.zzb
            long r5 = r11.zzd
            com.google.android.gms.measurement.internal.zzbc r10 = new com.google.android.gms.measurement.internal.zzbc
            r0 = r10
            r1 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r7, r9)
            return r10
    }
}
