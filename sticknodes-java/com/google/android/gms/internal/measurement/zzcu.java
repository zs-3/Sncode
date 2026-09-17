package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzcu extends com.google.android.gms.internal.measurement.zzbn implements com.google.android.gms.internal.measurement.zzcv {
    public zzcu() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.internal.measurement.zzcv asInterface(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzcv
            if (r1 == 0) goto L11
            com.google.android.gms.internal.measurement.zzcv r0 = (com.google.android.gms.internal.measurement.zzcv) r0
            return r0
        L11:
            com.google.android.gms.internal.measurement.zzct r0 = new com.google.android.gms.internal.measurement.zzct
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    protected final boolean zza(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
            r10 = this;
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r3 = 0
            switch(r11) {
                case 1: goto L5ab;
                case 2: goto L587;
                case 3: goto L54e;
                case 4: goto L52d;
                case 5: goto L501;
                case 6: goto L4dd;
                case 7: goto L4cd;
                case 8: goto L4b9;
                case 9: goto L4a1;
                case 10: goto L479;
                case 11: goto L469;
                case 12: goto L45d;
                case 13: goto L451;
                case 14: goto L445;
                case 15: goto L428;
                case 16: goto L408;
                case 17: goto L3e8;
                case 18: goto L3c6;
                case 19: goto L3a6;
                case 20: goto L386;
                case 21: goto L366;
                case 22: goto L346;
                case 23: goto L336;
                case 24: goto L326;
                case 25: goto L312;
                case 26: goto L2fe;
                case 27: goto L2e2;
                case 28: goto L2ce;
                case 29: goto L2ba;
                case 30: goto L2a6;
                case 31: goto L27a;
                case 32: goto L24e;
                case 33: goto L225;
                case 34: goto L205;
                case 35: goto L1e5;
                case 36: goto L1c5;
                case 37: goto L1b9;
                case 38: goto L195;
                case 39: goto L189;
                case 40: goto L169;
                case 41: goto L8;
                case 42: goto L159;
                case 43: goto L14d;
                case 44: goto L139;
                case 45: goto L125;
                case 46: goto L105;
                case 47: goto L8;
                case 48: goto Lf5;
                case 49: goto L8;
                case 50: goto Ld8;
                case 51: goto Lc4;
                case 52: goto Lb0;
                case 53: goto L94;
                case 54: goto L80;
                case 55: goto L6c;
                case 56: goto L58;
                case 57: goto L2c;
                case 58: goto La;
                default: goto L8;
            }
        L8:
            r0 = 0
            return r0
        La:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L11
            goto L24
        L11:
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdb
            if (r3 == 0) goto L1f
            r3 = r2
            com.google.android.gms.internal.measurement.zzdb r3 = (com.google.android.gms.internal.measurement.zzdb) r3
            goto L24
        L1f:
            com.google.android.gms.internal.measurement.zzcz r3 = new com.google.android.gms.internal.measurement.zzcz
            r3.<init>(r1)
        L24:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.retrieveAndUploadBatches(r3)
            goto L5c5
        L2c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L3b
            goto L4c
        L3b:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L47
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L4c
        L47:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r4)
        L4c:
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivitySaveInstanceStateByScionActivityInfo(r1, r3, r4)
            goto L5c5
        L58:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityResumedByScionActivityInfo(r1, r2)
            goto L5c5
        L6c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityPausedByScionActivityInfo(r1, r2)
            goto L5c5
        L80:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityDestroyedByScionActivityInfo(r1, r2)
            goto L5c5
        L94:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityCreatedByScionActivityInfo(r1, r2, r3)
            goto L5c5
        Lb0:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityStoppedByScionActivityInfo(r1, r2)
            goto L5c5
        Lc4:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityStartedByScionActivityInfo(r1, r2)
            goto L5c5
        Ld8:
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdj> r1 = com.google.android.gms.internal.measurement.zzdj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            com.google.android.gms.internal.measurement.zzdj r1 = (com.google.android.gms.internal.measurement.zzdj) r1
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r0 = r10
            r0.setCurrentScreenByScionActivityInfo(r1, r2, r3, r4)
            goto L5c5
        Lf5:
            android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            android.content.Intent r1 = (android.content.Intent) r1
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setSgtmDebugInfo(r1)
            goto L5c5
        L105:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L10c
            goto L11d
        L10c:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L118
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L11d
        L118:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L11d:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getSessionId(r3)
            goto L5c5
        L125:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setConsentThirdParty(r1, r2)
            goto L5c5
        L139:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setConsent(r1, r2)
            goto L5c5
        L14d:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.clearMeasurementEnabled(r1)
            goto L5c5
        L159:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setDefaultEventParameters(r1)
            goto L5c5
        L169:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L170
            goto L181
        L170:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L17c
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L181
        L17c:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L181:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.isDataCollectionEnabled(r3)
            goto L5c5
        L189:
            boolean r1 = com.google.android.gms.internal.measurement.zzbo.zzf(r12)
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setDataCollectionEnabled(r1)
            goto L5c5
        L195:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L19c
            goto L1ad
        L19c:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L1a8
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L1ad
        L1a8:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L1ad:
            int r1 = r12.readInt()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getTestFlag(r3, r1)
            goto L5c5
        L1b9:
            java.util.HashMap r1 = com.google.android.gms.internal.measurement.zzbo.zzb(r12)
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.initForTests(r1)
            goto L5c5
        L1c5:
            android.os.IBinder r2 = r12.readStrongBinder()
            if (r2 != 0) goto L1cc
            goto L1dd
        L1cc:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzde
            if (r3 == 0) goto L1d8
            r3 = r1
            com.google.android.gms.internal.measurement.zzde r3 = (com.google.android.gms.internal.measurement.zzde) r3
            goto L1dd
        L1d8:
            com.google.android.gms.internal.measurement.zzdc r3 = new com.google.android.gms.internal.measurement.zzdc
            r3.<init>(r2)
        L1dd:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.unregisterOnMeasurementEventListener(r3)
            goto L5c5
        L1e5:
            android.os.IBinder r2 = r12.readStrongBinder()
            if (r2 != 0) goto L1ec
            goto L1fd
        L1ec:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzde
            if (r3 == 0) goto L1f8
            r3 = r1
            com.google.android.gms.internal.measurement.zzde r3 = (com.google.android.gms.internal.measurement.zzde) r3
            goto L1fd
        L1f8:
            com.google.android.gms.internal.measurement.zzdc r3 = new com.google.android.gms.internal.measurement.zzdc
            r3.<init>(r2)
        L1fd:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.registerOnMeasurementEventListener(r3)
            goto L5c5
        L205:
            android.os.IBinder r2 = r12.readStrongBinder()
            if (r2 != 0) goto L20c
            goto L21d
        L20c:
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzde
            if (r3 == 0) goto L218
            r3 = r1
            com.google.android.gms.internal.measurement.zzde r3 = (com.google.android.gms.internal.measurement.zzde) r3
            goto L21d
        L218:
            com.google.android.gms.internal.measurement.zzdc r3 = new com.google.android.gms.internal.measurement.zzdc
            r3.<init>(r2)
        L21d:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setEventInterceptor(r3)
            goto L5c5
        L225:
            int r1 = r12.readInt()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.IBinder r4 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.IBinder r5 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r0 = r10
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L5c5
        L24e:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L25d
            goto L26e
        L25d:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L269
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L26e
        L269:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r4)
        L26e:
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.performAction(r1, r3, r4)
            goto L5c5
        L27a:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L289
            goto L29a
        L289:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L295
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L29a
        L295:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r4)
        L29a:
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivitySaveInstanceState(r1, r3, r4)
            goto L5c5
        L2a6:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityResumed(r1, r2)
            goto L5c5
        L2ba:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityPaused(r1, r2)
            goto L5c5
        L2ce:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityDestroyed(r1, r2)
            goto L5c5
        L2e2:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityCreated(r1, r2, r3)
            goto L5c5
        L2fe:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityStopped(r1, r2)
            goto L5c5
        L312:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.onActivityStarted(r1, r2)
            goto L5c5
        L326:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.endAdUnitExposure(r1, r2)
            goto L5c5
        L336:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.beginAdUnitExposure(r1, r2)
            goto L5c5
        L346:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L34d
            goto L35e
        L34d:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L359
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L35e
        L359:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L35e:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.generateEventId(r3)
            goto L5c5
        L366:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L36d
            goto L37e
        L36d:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L379
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L37e
        L379:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L37e:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getGmpAppId(r3)
            goto L5c5
        L386:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L38d
            goto L39e
        L38d:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L399
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L39e
        L399:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L39e:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getAppInstanceId(r3)
            goto L5c5
        L3a6:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L3ad
            goto L3be
        L3ad:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L3b9
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L3be
        L3b9:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L3be:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getCachedAppInstanceId(r3)
            goto L5c5
        L3c6:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L3cd
            goto L3e0
        L3cd:
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdg
            if (r3 == 0) goto L3db
            r3 = r2
            com.google.android.gms.internal.measurement.zzdg r3 = (com.google.android.gms.internal.measurement.zzdg) r3
            goto L3e0
        L3db:
            com.google.android.gms.internal.measurement.zzdf r3 = new com.google.android.gms.internal.measurement.zzdf
            r3.<init>(r1)
        L3e0:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setInstanceIdProvider(r3)
            goto L5c5
        L3e8:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L3ef
            goto L400
        L3ef:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L3fb
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L400
        L3fb:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L400:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getCurrentScreenClass(r3)
            goto L5c5
        L408:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L40f
            goto L420
        L40f:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L41b
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L420
        L41b:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r1)
        L420:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getCurrentScreenName(r3)
            goto L5c5
        L428:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            long r4 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r0 = r10
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L5c5
        L445:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setSessionTimeoutDuration(r1)
            goto L5c5
        L451:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setMinimumSessionDuration(r1)
            goto L5c5
        L45d:
            long r1 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.resetAnalyticsData(r1)
            goto L5c5
        L469:
            boolean r1 = com.google.android.gms.internal.measurement.zzbo.zzf(r12)
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setMeasurementEnabled(r1, r2)
            goto L5c5
        L479:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.IBinder r5 = r12.readStrongBinder()
            if (r5 != 0) goto L488
            goto L499
        L488:
            android.os.IInterface r2 = r5.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L494
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L499
        L494:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r5)
        L499:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getConditionalUserProperties(r1, r4, r3)
            goto L5c5
        L4a1:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.clearConditionalUserProperty(r1, r2, r3)
            goto L5c5
        L4b9:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setConditionalUserProperty(r1, r2)
            goto L5c5
        L4cd:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.setUserId(r1, r2)
            goto L5c5
        L4dd:
            java.lang.String r1 = r12.readString()
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L4e8
            goto L4f9
        L4e8:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L4f4
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L4f9
        L4f4:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r4)
        L4f9:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getMaxUserProperties(r1, r3)
            goto L5c5
        L501:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            boolean r5 = com.google.android.gms.internal.measurement.zzbo.zzf(r12)
            android.os.IBinder r6 = r12.readStrongBinder()
            if (r6 != 0) goto L514
            goto L525
        L514:
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L520
            r3 = r2
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            goto L525
        L520:
            com.google.android.gms.internal.measurement.zzcw r3 = new com.google.android.gms.internal.measurement.zzcw
            r3.<init>(r6)
        L525:
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.getUserProperties(r1, r4, r5, r3)
            goto L5c5
        L52d:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            boolean r4 = com.google.android.gms.internal.measurement.zzbo.zzf(r12)
            long r5 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r0 = r10
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L5c5
        L54e:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r12.readStrongBinder()
            if (r6 != 0) goto L566
            r6 = r3
            goto L577
        L566:
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcy
            if (r3 == 0) goto L571
            com.google.android.gms.internal.measurement.zzcy r2 = (com.google.android.gms.internal.measurement.zzcy) r2
            goto L576
        L571:
            com.google.android.gms.internal.measurement.zzcw r2 = new com.google.android.gms.internal.measurement.zzcw
            r2.<init>(r6)
        L576:
            r6 = r2
        L577:
            long r8 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r0 = r10
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L5c5
        L587:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r4 = com.google.android.gms.internal.measurement.zzbo.zzf(r12)
            boolean r5 = com.google.android.gms.internal.measurement.zzbo.zzf(r12)
            long r6 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r0 = r10
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L5c5
        L5ab:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdh> r2 = com.google.android.gms.internal.measurement.zzdh.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbo.zza(r12, r2)
            com.google.android.gms.internal.measurement.zzdh r2 = (com.google.android.gms.internal.measurement.zzdh) r2
            long r3 = r12.readLong()
            com.google.android.gms.internal.measurement.zzbo.zzc(r12)
            r10.initialize(r1, r2, r3)
        L5c5:
            r13.writeNoException()
            r0 = 1
            return r0
    }
}
