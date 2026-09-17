package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends androidx.legacy.content.WakefulBroadcastReceiver implements com.google.android.gms.measurement.internal.zzhx.zza {
    private com.google.android.gms.measurement.internal.zzhx zza;

    public AppMeasurementReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public android.content.BroadcastReceiver.PendingResult doGoAsync() {
            r1 = this;
            android.content.BroadcastReceiver$PendingResult r0 = r1.goAsync()
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzhx.zza
    public void doStartService(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            androidx.legacy.content.WakefulBroadcastReceiver.startWakefulService(r1, r2)
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            com.google.android.gms.measurement.internal.zzhx r0 = r1.zza
            if (r0 != 0) goto Lb
            com.google.android.gms.measurement.internal.zzhx r0 = new com.google.android.gms.measurement.internal.zzhx
            r0.<init>(r1)
            r1.zza = r0
        Lb:
            com.google.android.gms.measurement.internal.zzhx r0 = r1.zza
            r0.zza(r2, r3)
            return
    }
}
