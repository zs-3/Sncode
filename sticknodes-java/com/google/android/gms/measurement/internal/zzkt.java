package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
final class zzkt implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzov zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzkt(com.google.android.gms.measurement.internal.zzlw r1, com.google.android.gms.measurement.internal.zzov r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    private final void zza() {
            r7 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r7.zzb
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzht r1 = r0.zzm()
            android.util.SparseArray r1 = r1.zze()
            com.google.android.gms.measurement.internal.zzov r2 = r7.zza
            int r3 = r2.zzc
            long r4 = r2.zzb
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r1.put(r3, r2)
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            int r2 = r1.size()
            int[] r2 = new int[r2]
            int r3 = r1.size()
            long[] r3 = new long[r3]
            r4 = 0
        L2a:
            int r5 = r1.size()
            if (r4 >= r5) goto L45
            int r5 = r1.keyAt(r4)
            r2[r4] = r5
            java.lang.Object r5 = r1.valueAt(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2a
        L45:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r4 = "uriSources"
            r1.putIntArray(r4, r2)
            java.lang.String r2 = "uriTimestamps"
            r1.putLongArray(r2, r3)
            com.google.android.gms.measurement.internal.zzho r0 = r0.zzi
            r0.zzb(r1)
            return
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable r7) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r6.zzb
            r0.zzg()
            r1 = 0
            com.google.android.gms.measurement.internal.zzlw.zzB(r0, r1)
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzam r2 = r1.zzf()
            com.google.android.gms.measurement.internal.zzgg r3 = com.google.android.gms.measurement.internal.zzgi.zzaZ
            r4 = 0
            boolean r2 = r2.zzx(r4, r3)
            if (r2 == 0) goto L1d
            int r2 = com.google.android.gms.measurement.internal.zzlw.zzaq(r0, r7)
            goto L1e
        L1d:
            r2 = 2
        L1e:
            int r2 = r2 + (-1)
            r3 = 1
            if (r2 == 0) goto Lcb
            if (r2 == r3) goto L4a
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzgs r2 = r2.zzh()
            java.lang.String r2 = r2.zzm()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r2)
            java.lang.String r4 = "registerTriggerAsync failed. Dropping URI. App ID, Throwable"
            r1.zzc(r4, r2, r7)
            r6.zza()
            com.google.android.gms.measurement.internal.zzlw.zzC(r0, r3)
            r0.zzU()
            return
        L4a:
            java.util.PriorityQueue r2 = r0.zzy()
            com.google.android.gms.measurement.internal.zzov r5 = r6.zza
            r2.add(r5)
            int r2 = com.google.android.gms.measurement.internal.zzlw.zzh(r0)
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzav
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r2 <= r4) goto L8c
            com.google.android.gms.measurement.internal.zzlw.zzC(r0, r3)
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzh()
            java.lang.String r0 = r0.zzm()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzhe.zzn(r0)
            java.lang.String r7 = r7.toString()
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            java.lang.String r2 = "registerTriggerAsync failed. May try later. App ID, throwable"
            r1.zzc(r2, r0, r7)
            return
        L8c:
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzgs r2 = r2.zzh()
            java.lang.String r2 = r2.zzm()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r2)
            int r3 = com.google.android.gms.measurement.internal.zzlw.zzh(r0)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzhe.zzn(r3)
            java.lang.String r7 = r7.toString()
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            java.lang.String r4 = "registerTriggerAsync failed. App ID, delay in seconds, throwable"
            r1.zzd(r4, r2, r3, r7)
            int r7 = com.google.android.gms.measurement.internal.zzlw.zzh(r0)
            com.google.android.gms.measurement.internal.zzlw.zzF(r0, r7)
            int r7 = com.google.android.gms.measurement.internal.zzlw.zzh(r0)
            int r7 = r7 + r7
            com.google.android.gms.measurement.internal.zzlw.zzC(r0, r7)
            return
        Lcb:
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzk()
            com.google.android.gms.measurement.internal.zzio r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzgs r2 = r2.zzh()
            java.lang.String r2 = r2.zzm()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzhe.zzn(r2)
            java.lang.String r7 = r7.toString()
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            java.lang.String r4 = "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable"
            r1.zzc(r4, r2, r7)
            com.google.android.gms.measurement.internal.zzlw.zzC(r0, r3)
            java.util.PriorityQueue r7 = r0.zzy()
            com.google.android.gms.measurement.internal.zzov r0 = r6.zza
            r7.add(r0)
            return
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzlw r4 = r3.zzb
            r4.zzg()
            r3.zza()
            r0 = 0
            com.google.android.gms.measurement.internal.zzlw.zzB(r4, r0)
            r0 = 1
            com.google.android.gms.measurement.internal.zzlw.zzC(r4, r0)
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            com.google.android.gms.measurement.internal.zzov r1 = r3.zza
            java.lang.String r1 = r1.zza
            java.lang.String r2 = "Successfully registered trigger URI"
            r0.zzb(r2, r1)
            r4.zzU()
            return
    }
}
