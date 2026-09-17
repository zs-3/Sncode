package com.google.firebase.sessions;

/* compiled from: EventGDTLogger.kt */
/* loaded from: classes2.dex */
public final class EventGDTLogger implements com.google.firebase.sessions.EventGDTLoggerInterface {
    public static final com.google.firebase.sessions.EventGDTLogger.Companion Companion = null;
    private final com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> transportFactoryProvider;

    /* compiled from: EventGDTLogger.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: $r8$lambda$2qXtOX2-XN6MMV70-qRGB1yv9mk, reason: not valid java name */
    public static /* synthetic */ byte[] m68$r8$lambda$2qXtOX2XN6MMV70qRGB1yv9mk(com.google.firebase.sessions.EventGDTLogger r0, com.google.firebase.sessions.SessionEvent r1) {
            byte[] r0 = r0.encode(r1)
            return r0
    }

    static {
            com.google.firebase.sessions.EventGDTLogger$Companion r0 = new com.google.firebase.sessions.EventGDTLogger$Companion
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.sessions.EventGDTLogger.Companion = r0
            return
    }

    public EventGDTLogger(com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> r2) {
            r1 = this;
            java.lang.String r0 = "transportFactoryProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.transportFactoryProvider = r2
            return
    }

    private final byte[] encode(com.google.firebase.sessions.SessionEvent r3) {
            r2 = this;
            com.google.firebase.sessions.SessionEvents r0 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.encoders.DataEncoder r0 = r0.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions()
            java.lang.String r3 = r0.encode(r3)
            java.lang.String r0 = "SessionEvents.SESSION_EVENT_ENCODER.encode(value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Session Event: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "EventGDTLogger"
            android.util.Log.d(r1, r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r3 = r3.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r3
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(com.google.firebase.sessions.SessionEvent r6) {
            r5 = this;
            java.lang.String r0 = "sessionEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> r0 = r5.transportFactoryProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.TransportFactory r0 = (com.google.android.datatransport.TransportFactory) r0
            java.lang.Class<com.google.firebase.sessions.SessionEvent> r1 = com.google.firebase.sessions.SessionEvent.class
            java.lang.String r2 = "json"
            com.google.android.datatransport.Encoding r2 = com.google.android.datatransport.Encoding.of(r2)
            com.google.firebase.sessions.EventGDTLogger$$ExternalSyntheticLambda0 r3 = new com.google.firebase.sessions.EventGDTLogger$$ExternalSyntheticLambda0
            r3.<init>(r5)
            java.lang.String r4 = "FIREBASE_APPQUALITY_SESSION"
            com.google.android.datatransport.Transport r0 = r0.getTransport(r4, r1, r2, r3)
            com.google.android.datatransport.Event r6 = com.google.android.datatransport.Event.ofData(r6)
            r0.send(r6)
            return
    }
}
