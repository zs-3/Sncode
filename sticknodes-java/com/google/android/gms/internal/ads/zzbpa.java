package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbpa extends com.google.android.gms.internal.ads.zzchj {
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zza;

    zzbpa(com.google.android.gms.measurement.api.AppMeasurementSdk r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final int zzb(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            int r2 = r0.getMaxUserProperties(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final long zzc() throws android.os.RemoteException {
            r2 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r2.zza
            long r0 = r0.generateEventId()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final android.os.Bundle zzd(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            android.os.Bundle r2 = r0.performActionWithResponse(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final java.lang.String zze() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            java.lang.String r0 = r0.getAppIdOrigin()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final java.lang.String zzf() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            java.lang.String r0 = r0.getAppInstanceId()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final java.lang.String zzg() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            java.lang.String r0 = r0.getCurrentScreenClass()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final java.lang.String zzh() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            java.lang.String r0 = r0.getCurrentScreenName()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final java.lang.String zzi() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            java.lang.String r0 = r0.getGmpAppId()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final java.util.List zzj(java.lang.String r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            java.util.List r2 = r0.getConditionalUserProperties(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final java.util.Map zzk(java.lang.String r2, java.lang.String r3, boolean r4) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            java.util.Map r2 = r0.getUserProperties(r2, r3, r4)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzl(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.beginAdUnitExposure(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzm(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.clearConditionalUserProperty(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzn(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.endAdUnitExposure(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzo(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.logEvent(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzp(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.performAction(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzq(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.setConditionalUserProperty(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzr(android.os.Bundle r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.setConsent(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzs(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, java.lang.String r4) throws android.os.RemoteException {
            r1 = this;
            if (r2 == 0) goto L9
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            goto La
        L9:
            r2 = 0
        La:
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.setCurrentScreen(r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzt(java.lang.String r2, java.lang.String r3, com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
            r1 = this;
            if (r4 == 0) goto L7
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)
            goto L8
        L7:
            r4 = 0
        L8:
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r1.zza
            r0.setUserProperty(r2, r3, r4)
            return
    }
}
