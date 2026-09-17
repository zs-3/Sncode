package com.google.firebase.crashlytics.internal.send;

/* loaded from: classes2.dex */
public class DataTransportCrashlyticsReportSender {
    private static final java.lang.String CRASHLYTICS_API_KEY = null;
    private static final java.lang.String CRASHLYTICS_ENDPOINT = null;
    private static final com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = null;
    private static final com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform TRANSFORM = null;
    private final com.google.firebase.crashlytics.internal.send.ReportQueue reportQueue;
    private final com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> transportTransform;

    public static /* synthetic */ byte[] $r8$lambda$ceNKGaFlE1_IExdHC5OascASr6A(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r0) {
            byte[] r0 = lambda$static$0(r0)
            return r0
    }

    static {
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r0 = new com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform
            r0.<init>()
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.TRANSFORM = r0
            java.lang.String r0 = "hts/cahyiseot-agolai.o/1frlglgc/aclg"
            java.lang.String r1 = "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"
            java.lang.String r0 = mergeStrings(r0, r1)
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.CRASHLYTICS_ENDPOINT = r0
            java.lang.String r0 = "AzSBpY4F0rHiHFdinTvM"
            java.lang.String r1 = "IayrSTFL9eJ69YeSUO2"
            java.lang.String r0 = mergeStrings(r0, r1)
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.CRASHLYTICS_API_KEY = r0
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda0 r0 = com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.DEFAULT_TRANSFORM = r0
            return
    }

    DataTransportCrashlyticsReportSender(com.google.firebase.crashlytics.internal.send.ReportQueue r1, com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> r2) {
            r0 = this;
            r0.<init>()
            r0.reportQueue = r1
            r0.transportTransform = r2
            return
    }

    public static com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender create(android.content.Context r4, com.google.firebase.crashlytics.internal.settings.SettingsProvider r5, com.google.firebase.crashlytics.internal.common.OnDemandCounter r6) {
            com.google.android.datatransport.runtime.TransportRuntime.initialize(r4)
            com.google.android.datatransport.runtime.TransportRuntime r4 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.cct.CCTDestination r0 = new com.google.android.datatransport.cct.CCTDestination
            java.lang.String r1 = com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.CRASHLYTICS_ENDPOINT
            java.lang.String r2 = com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.CRASHLYTICS_API_KEY
            r0.<init>(r1, r2)
            com.google.android.datatransport.TransportFactory r4 = r4.newFactory(r0)
            java.lang.Class<com.google.firebase.crashlytics.internal.model.CrashlyticsReport> r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.class
            java.lang.String r1 = "json"
            com.google.android.datatransport.Encoding r1 = com.google.android.datatransport.Encoding.of(r1)
            com.google.android.datatransport.Transformer<com.google.firebase.crashlytics.internal.model.CrashlyticsReport, byte[]> r2 = com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.DEFAULT_TRANSFORM
            java.lang.String r3 = "FIREBASE_CRASHLYTICS_REPORT"
            com.google.android.datatransport.Transport r4 = r4.getTransport(r3, r0, r1, r2)
            com.google.firebase.crashlytics.internal.send.ReportQueue r0 = new com.google.firebase.crashlytics.internal.send.ReportQueue
            com.google.firebase.crashlytics.internal.settings.Settings r5 = r5.getSettingsSync()
            r0.<init>(r4, r5, r6)
            com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender r4 = new com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender
            r4.<init>(r0, r2)
            return r4
    }

    private static /* synthetic */ byte[] lambda$static$0(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r1) {
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform r0 = com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender.TRANSFORM
            java.lang.String r1 = r0.reportToJson(r1)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    private static java.lang.String mergeStrings(java.lang.String r3, java.lang.String r4) {
            int r0 = r3.length()
            int r1 = r4.length()
            int r0 = r0 - r1
            if (r0 < 0) goto L3f
            r1 = 1
            if (r0 > r1) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r2 = r4.length()
            int r1 = r1 + r2
            r0.<init>(r1)
            r1 = 0
        L1d:
            int r2 = r3.length()
            if (r1 >= r2) goto L3a
            char r2 = r3.charAt(r1)
            r0.append(r2)
            int r2 = r4.length()
            if (r2 <= r1) goto L37
            char r2 = r4.charAt(r1)
            r0.append(r2)
        L37:
            int r1 = r1 + 1
            goto L1d
        L3a:
            java.lang.String r3 = r0.toString()
            return r3
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid input received"
            r3.<init>(r4)
            throw r3
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId> enqueueReport(com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId r2, boolean r3) {
            r1 = this;
            com.google.firebase.crashlytics.internal.send.ReportQueue r0 = r1.reportQueue
            com.google.android.gms.tasks.TaskCompletionSource r2 = r0.enqueueReport(r2, r3)
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            return r2
    }
}
