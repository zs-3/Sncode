package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zay extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.common.moduleinstall.ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final com.google.android.gms.common.api.Api.ClientKey zac = null;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zad = null;
    private static final com.google.android.gms.common.api.Api zae = null;

    static {
            com.google.android.gms.common.api.Api$ClientKey r0 = new com.google.android.gms.common.api.Api$ClientKey
            r0.<init>()
            com.google.android.gms.common.moduleinstall.internal.zay.zac = r0
            com.google.android.gms.common.moduleinstall.internal.zaq r1 = new com.google.android.gms.common.moduleinstall.internal.zaq
            r1.<init>()
            com.google.android.gms.common.moduleinstall.internal.zay.zad = r1
            com.google.android.gms.common.api.Api r2 = new com.google.android.gms.common.api.Api
            java.lang.String r3 = "ModuleInstall.API"
            r2.<init>(r3, r1, r0)
            com.google.android.gms.common.moduleinstall.internal.zay.zae = r2
            return
    }

    public zay(android.app.Activity r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.common.moduleinstall.internal.zay.zae
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public zay(android.content.Context r4) {
            r3 = this;
            com.google.android.gms.common.api.Api r0 = com.google.android.gms.common.moduleinstall.internal.zay.zae
            com.google.android.gms.common.api.Api$ApiOptions$NoOptions r1 = com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS
            com.google.android.gms.common.api.GoogleApi$Settings r2 = com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS
            r3.<init>(r4, r0, r1, r2)
            return
    }

    static final com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest zad(boolean r4, com.google.android.gms.common.api.OptionalModuleApi... r5) {
            java.lang.String r0 = "Requested APIs must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r0)
            int r0 = r5.length
            r1 = 0
            if (r0 <= 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            java.lang.String r3 = "Please provide at least one OptionalModuleApi."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r3)
        L11:
            if (r1 >= r0) goto L1d
            r2 = r5[r1]
            java.lang.String r3 = "Requested API must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r3)
            int r1 = r1 + 1
            goto L11
        L1d:
            java.util.List r5 = java.util.Arrays.asList(r5)
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r4 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.zaa(r5, r4)
            return r4
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> areModulesAvailable(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L1a
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r5 = new com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse
            r5.<init>(r2, r0)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            return r5
        L1a:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.base.zav.zaa
            r2[r0] = r3
            r1.setFeatures(r2)
            r2 = 27301(0x6aa5, float:3.8257E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zal r0 = new com.google.android.gms.common.moduleinstall.internal.zal
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> deferredInstall(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            r5 = 0
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            goto L3b
        L15:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r2 = 1
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.base.zav.zaa
            r2[r0] = r3
            r1.setFeatures(r2)
            r2 = 27302(0x6aa6, float:3.8258E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zap r0 = new com.google.android.gms.common.moduleinstall.internal.zap
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
        L3b:
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> getInstallModulesIntent(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 1
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r5 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse
            r0 = 0
            r5.<init>(r0)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            return r5
        L1a:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            r2 = 0
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.base.zav.zaa
            r0[r2] = r3
            r1.setFeatures(r0)
            r0 = 27307(0x6aab, float:3.8265E-41)
            r1.setMethodKey(r0)
            com.google.android.gms.common.moduleinstall.internal.zan r0 = new com.google.android.gms.common.moduleinstall.internal.zan
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> installModules(com.google.android.gms.common.moduleinstall.ModuleInstallRequest r12) {
            r11 = this;
            java.lang.Class<com.google.android.gms.common.moduleinstall.InstallStatusListener> r0 = com.google.android.gms.common.moduleinstall.InstallStatusListener.class
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest.fromModuleInstallRequest(r12)
            com.google.android.gms.common.moduleinstall.InstallStatusListener r4 = r12.getListener()
            java.util.concurrent.Executor r12 = r12.getListenerExecutor()
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            r7 = 0
            if (r1 == 0) goto L24
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse r12 = new com.google.android.gms.common.moduleinstall.ModuleInstallResponse
            r12.<init>(r7)
            com.google.android.gms.tasks.Task r12 = com.google.android.gms.tasks.Tasks.forResult(r12)
            goto Laa
        L24:
            r8 = 1
            if (r4 != 0) goto L4d
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r12 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r8]
            com.google.android.gms.common.Feature r1 = com.google.android.gms.internal.base.zav.zaa
            r0[r7] = r1
            r12.setFeatures(r0)
            r12.setAutoResolveMissingFeatures(r8)
            r0 = 27304(0x6aa8, float:3.8261E-41)
            r12.setMethodKey(r0)
            com.google.android.gms.common.moduleinstall.internal.zao r0 = new com.google.android.gms.common.moduleinstall.internal.zao
            r0.<init>(r11, r5)
            r12.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r12 = r12.build()
            com.google.android.gms.tasks.Task r12 = r11.doRead(r12)
            goto Laa
        L4d:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            if (r12 != 0) goto L5b
            java.lang.String r12 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder r12 = r11.registerListener(r4, r12)
            goto L63
        L5b:
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder r12 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(r4, r12, r0)
        L63:
            com.google.android.gms.common.moduleinstall.internal.zaab r0 = new com.google.android.gms.common.moduleinstall.internal.zaab
            r0.<init>(r12)
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            com.google.android.gms.common.moduleinstall.internal.zai r10 = new com.google.android.gms.common.moduleinstall.internal.zai
            r1 = r10
            r2 = r11
            r3 = r9
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.common.moduleinstall.internal.zaj r1 = new com.google.android.gms.common.moduleinstall.internal.zaj
            r1.<init>(r11, r0)
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = com.google.android.gms.common.api.internal.RegistrationMethods.builder()
            r0.withHolder(r12)
            com.google.android.gms.common.Feature[] r12 = new com.google.android.gms.common.Feature[r8]
            com.google.android.gms.common.Feature r2 = com.google.android.gms.internal.base.zav.zaa
            r12[r7] = r2
            r0.setFeatures(r12)
            r0.setAutoResolveMissingFeatures(r8)
            r0.register(r10)
            r0.unregister(r1)
            r12 = 27305(0x6aa9, float:3.8262E-41)
            r0.setMethodKey(r12)
            com.google.android.gms.common.api.internal.RegistrationMethods r12 = r0.build()
            com.google.android.gms.tasks.Task r12 = r11.doRegisterEventListener(r12)
            com.google.android.gms.common.moduleinstall.internal.zak r0 = new com.google.android.gms.common.moduleinstall.internal.zak
            r0.<init>(r9)
            com.google.android.gms.tasks.Task r12 = r12.onSuccessTask(r0)
        Laa:
            return r12
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> releaseModules(com.google.android.gms.common.api.OptionalModuleApi... r5) {
            r4 = this;
            r0 = 0
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r5 = zad(r0, r5)
            java.util.List r1 = r5.getApiFeatures()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            r5 = 0
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            goto L3b
        L15:
            com.google.android.gms.common.api.internal.TaskApiCall$Builder r1 = com.google.android.gms.common.api.internal.TaskApiCall.builder()
            r2 = 1
            com.google.android.gms.common.Feature[] r2 = new com.google.android.gms.common.Feature[r2]
            com.google.android.gms.common.Feature r3 = com.google.android.gms.internal.base.zav.zaa
            r2[r0] = r3
            r1.setFeatures(r2)
            r2 = 27303(0x6aa7, float:3.826E-41)
            r1.setMethodKey(r2)
            r1.setAutoResolveMissingFeatures(r0)
            com.google.android.gms.common.moduleinstall.internal.zam r0 = new com.google.android.gms.common.moduleinstall.internal.zam
            r0.<init>(r4, r5)
            r1.run(r0)
            com.google.android.gms.common.api.internal.TaskApiCall r5 = r1.build()
            com.google.android.gms.tasks.Task r5 = r4.doRead(r5)
        L3b:
            return r5
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterListener(com.google.android.gms.common.moduleinstall.InstallStatusListener r2) {
            r1 = this;
            java.lang.Class<com.google.android.gms.common.moduleinstall.InstallStatusListener> r0 = com.google.android.gms.common.moduleinstall.InstallStatusListener.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(r2, r0)
            r0 = 27306(0x6aaa, float:3.8264E-41)
            com.google.android.gms.tasks.Task r2 = r1.doUnregisterEventListener(r2, r0)
            return r2
    }
}
