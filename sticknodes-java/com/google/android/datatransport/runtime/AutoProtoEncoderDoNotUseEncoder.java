package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements com.google.firebase.encoders.config.Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final com.google.firebase.encoders.config.Configurator CONFIG = null;

    private static final class ClientMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.ClientMetrics> {
        private static final com.google.firebase.encoders.FieldDescriptor APPNAMESPACE_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor GLOBALMETRICS_DESCRIPTOR = null;
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor WINDOW_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder
                r0.<init>()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.INSTANCE = r0
                java.lang.String r0 = "window"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 1
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.WINDOW_DESCRIPTOR = r0
                java.lang.String r0 = "logSourceMetrics"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 2
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.LOGSOURCEMETRICS_DESCRIPTOR = r0
                java.lang.String r0 = "globalMetrics"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 3
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.GLOBALMETRICS_DESCRIPTOR = r0
                java.lang.String r0 = "appNamespace"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 4
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.APPNAMESPACE_DESCRIPTOR = r0
                return
        }

        private ClientMetricsEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.WINDOW_DESCRIPTOR
                com.google.android.datatransport.runtime.firebase.transport.TimeWindow r1 = r3.getWindowInternal()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.LOGSOURCEMETRICS_DESCRIPTOR
                java.util.List r1 = r3.getLogSourceMetricsList()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.GLOBALMETRICS_DESCRIPTOR
                com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r1 = r3.getGlobalMetricsInternal()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.APPNAMESPACE_DESCRIPTOR
                java.lang.String r3 = r3.getAppNamespace()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r1 = (com.google.android.datatransport.runtime.firebase.transport.ClientMetrics) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class GlobalMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor STORAGEMETRICS_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder
                r0.<init>()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder.INSTANCE = r0
                java.lang.String r0 = "storageMetrics"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 1
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder.STORAGEMETRICS_DESCRIPTOR = r0
                return
        }

        private GlobalMetricsEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder.STORAGEMETRICS_DESCRIPTOR
                com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r2 = r2.getStorageMetricsInternal()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics r1 = (com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class LogEventDroppedEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> {
        private static final com.google.firebase.encoders.FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR = null;
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor REASON_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder
                r0.<init>()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.INSTANCE = r0
                java.lang.String r0 = "eventsDroppedCount"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 1
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.EVENTSDROPPEDCOUNT_DESCRIPTOR = r0
                java.lang.String r0 = "reason"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 3
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.REASON_DESCRIPTOR = r0
                return
        }

        private LogEventDroppedEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.EVENTSDROPPEDCOUNT_DESCRIPTOR
                long r1 = r4.getEventsDroppedCount()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.REASON_DESCRIPTOR
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason r4 = r4.getReason()
                r5.add(r0, r4)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.runtime.firebase.transport.LogEventDropped r1 = (com.google.android.datatransport.runtime.firebase.transport.LogEventDropped) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class LogSourceMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> {
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = null;
        private static final com.google.firebase.encoders.FieldDescriptor LOGSOURCE_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder
                r0.<init>()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.INSTANCE = r0
                java.lang.String r0 = "logSource"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 1
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.LOGSOURCE_DESCRIPTOR = r0
                java.lang.String r0 = "logEventDropped"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 2
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.LOGEVENTDROPPED_DESCRIPTOR = r0
                return
        }

        private LogSourceMetricsEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics r3, com.google.firebase.encoders.ObjectEncoderContext r4) throws java.io.IOException {
                r2 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.LOGSOURCE_DESCRIPTOR
                java.lang.String r1 = r3.getLogSource()
                r4.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.LOGEVENTDROPPED_DESCRIPTOR
                java.util.List r3 = r3.getLogEventDroppedList()
                r4.add(r0, r3)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics r1 = (com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class ProtoEncoderDoNotUseEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.ProtoEncoderDoNotUse> {
        private static final com.google.firebase.encoders.FieldDescriptor CLIENTMETRICS_DESCRIPTOR = null;
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder INSTANCE = null;

        static {
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder
                r0.<init>()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.INSTANCE = r0
                java.lang.String r0 = "clientMetrics"
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.FieldDescriptor.of(r0)
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.CLIENTMETRICS_DESCRIPTOR = r0
                return
        }

        private ProtoEncoderDoNotUseEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.runtime.ProtoEncoderDoNotUse r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
                r1 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.CLIENTMETRICS_DESCRIPTOR
                com.google.android.datatransport.runtime.firebase.transport.ClientMetrics r2 = r2.getClientMetrics()
                r3.add(r0, r2)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.runtime.ProtoEncoderDoNotUse r1 = (com.google.android.datatransport.runtime.ProtoEncoderDoNotUse) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class StorageMetricsEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.StorageMetrics> {
        private static final com.google.firebase.encoders.FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = null;
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder
                r0.<init>()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.INSTANCE = r0
                java.lang.String r0 = "currentCacheSizeBytes"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 1
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.CURRENTCACHESIZEBYTES_DESCRIPTOR = r0
                java.lang.String r0 = "maxCacheSizeBytes"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 2
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.MAXCACHESIZEBYTES_DESCRIPTOR = r0
                return
        }

        private StorageMetricsEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.CURRENTCACHESIZEBYTES_DESCRIPTOR
                long r1 = r4.getCurrentCacheSizeBytes()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.MAXCACHESIZEBYTES_DESCRIPTOR
                long r1 = r4.getMaxCacheSizeBytes()
                r5.add(r0, r1)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.runtime.firebase.transport.StorageMetrics r1 = (com.google.android.datatransport.runtime.firebase.transport.StorageMetrics) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    private static final class TimeWindowEncoder implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.runtime.firebase.transport.TimeWindow> {
        private static final com.google.firebase.encoders.FieldDescriptor ENDMS_DESCRIPTOR = null;
        static final com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder INSTANCE = null;
        private static final com.google.firebase.encoders.FieldDescriptor STARTMS_DESCRIPTOR = null;

        static {
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder
                r0.<init>()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.INSTANCE = r0
                java.lang.String r0 = "startMs"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 1
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.STARTMS_DESCRIPTOR = r0
                java.lang.String r0 = "endMs"
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
                com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
                r2 = 2
                com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
                com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
                com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
                com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
                com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.ENDMS_DESCRIPTOR = r0
                return
        }

        private TimeWindowEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        public void encode(com.google.android.datatransport.runtime.firebase.transport.TimeWindow r4, com.google.firebase.encoders.ObjectEncoderContext r5) throws java.io.IOException {
                r3 = this;
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.STARTMS_DESCRIPTOR
                long r1 = r4.getStartMs()
                r5.add(r0, r1)
                com.google.firebase.encoders.FieldDescriptor r0 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.ENDMS_DESCRIPTOR
                long r1 = r4.getEndMs()
                r5.add(r0, r1)
                return
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                com.google.android.datatransport.runtime.firebase.transport.TimeWindow r1 = (com.google.android.datatransport.runtime.firebase.transport.TimeWindow) r1
                com.google.firebase.encoders.ObjectEncoderContext r2 = (com.google.firebase.encoders.ObjectEncoderContext) r2
                r0.encode(r1, r2)
                return
        }
    }

    static {
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder r0 = new com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder
            r0.<init>()
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.CONFIG = r0
            return
    }

    private AutoProtoEncoderDoNotUseEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(com.google.firebase.encoders.config.EncoderConfig<?> r3) {
            r2 = this;
            java.lang.Class<com.google.android.datatransport.runtime.ProtoEncoderDoNotUse> r0 = com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.class
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ProtoEncoderDoNotUseEncoder r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ProtoEncoderDoNotUseEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.runtime.firebase.transport.ClientMetrics> r0 = com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.class
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$ClientMetricsEncoder r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.ClientMetricsEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.runtime.firebase.transport.TimeWindow> r0 = com.google.android.datatransport.runtime.firebase.transport.TimeWindow.class
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$TimeWindowEncoder r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.TimeWindowEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> r0 = com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.class
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogSourceMetricsEncoder r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogSourceMetricsEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> r0 = com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.class
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$LogEventDroppedEncoder r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.LogEventDroppedEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics> r0 = com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.class
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$GlobalMetricsEncoder r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.GlobalMetricsEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            java.lang.Class<com.google.android.datatransport.runtime.firebase.transport.StorageMetrics> r0 = com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.class
            com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder$StorageMetricsEncoder r1 = com.google.android.datatransport.runtime.AutoProtoEncoderDoNotUseEncoder.StorageMetricsEncoder.INSTANCE
            r3.registerEncoder(r0, r1)
            return
    }
}
