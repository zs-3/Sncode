package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class AACTrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    static java.util.Map<java.lang.Integer, java.lang.String> audioObjectTypes;
    public static java.util.Map<java.lang.Integer, java.lang.Integer> samplingFrequencyIndexMap;
    long avgBitRate;
    int bufferSizeDB;
    private com.googlecode.mp4parser.DataSource dataSource;
    long[] decTimes;
    com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.AdtsHeader firstHeader;
    private java.lang.String lang;
    long maxBitRate;
    com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;


    class AdtsHeader {
        int bufferFullness;
        int channelconfig;
        int copyrightStart;
        int copyrightedStream;
        int frameLength;
        int home;
        int layer;
        int mpegVersion;
        int numAacFramesPerAdtsFrame;
        int original;
        int profile;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.AACTrackImpl this$0;

        AdtsHeader(com.googlecode.mp4parser.authoring.tracks.AACTrackImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        int getSize() {
                r1 = this;
                int r0 = r1.protectionAbsent
                if (r0 != 0) goto L6
                r0 = 2
                goto L7
            L6:
                r0 = 0
            L7:
                int r0 = r0 + 7
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes = r0
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "AAC Main"
            r0.put(r1, r2)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "AAC LC (Low Complexity)"
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "AAC SSR (Scalable Sample Rate)"
            r0.put(r3, r4)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "AAC LTP (Long Term Prediction)"
            r0.put(r4, r5)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r5 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "SBR (Spectral Band Replication)"
            r0.put(r5, r6)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "AAC Scalable"
            r0.put(r6, r7)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r7 = 7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "TwinVQ"
            r0.put(r7, r8)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r8 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "CELP (Code Excited Linear Prediction)"
            r0.put(r8, r9)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r9 = 9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "HXVC (Harmonic Vector eXcitation Coding)"
            r0.put(r9, r10)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r10 = 10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "Reserved"
            r0.put(r10, r11)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r12 = 11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.put(r12, r11)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r13 = 12
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "TTSI (Text-To-Speech Interface)"
            r0.put(r13, r14)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r13 = 13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "Main Synthesis"
            r0.put(r13, r14)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r13 = 14
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "Wavetable Synthesis"
            r0.put(r13, r14)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r13 = 15
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "General MIDI"
            r0.put(r13, r14)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r13 = 16
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "Algorithmic Synthesis and Audio Effects"
            r0.put(r13, r14)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r13 = 17
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "ER (Error Resilient) AAC LC"
            r0.put(r13, r14)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r13 = 18
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.put(r13, r11)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 19
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER AAC LTP"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 20
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER AAC Scalable"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 21
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER TwinVQ"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 22
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER BSAC (Bit-Sliced Arithmetic Coding)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 23
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER AAC LD (Low Delay)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 24
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER CELP"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 25
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER HVXC"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 26
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER HILN (Harmonic and Individual Lines plus Noise)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 27
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER Parametric"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 28
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "SSC (SinuSoidal Coding)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 29
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "PS (Parametric Stereo)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 30
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "MPEG Surround"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 31
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "(Escape value)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 32
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "Layer-1"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 33
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "Layer-2"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 34
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "Layer-3"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 35
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "DST (Direct Stream Transfer)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 36
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ALS (Audio Lossless)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 37
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "SLS (Scalable LosslesS)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 38
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "SLS non-core"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 39
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "ER AAC ELD (Enhanced Low Delay)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 40
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "SMR (Symbolic Music Representation) Simple"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 41
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "SMR Main"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 42
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "USAC (Unified Speech and Audio Coding) (no SBR)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 43
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "SAOC (Spatial Audio Object Coding)"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 44
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "LD MPEG Surround"
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.String> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.audioObjectTypes
            r11 = 45
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r13 = "USAC"
            r0.put(r11, r13)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap = r0
            r11 = 96000(0x17700, float:1.34525E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.put(r11, r13)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r14 = 88200(0x15888, float:1.23595E-40)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.put(r14, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r15 = 64000(0xfa00, float:8.9683E-41)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r0.put(r15, r2)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r16 = 48000(0xbb80, float:6.7262E-41)
            r17 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r0.put(r2, r3)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r2 = 44100(0xac44, float:6.1797E-41)
            r18 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r4)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r3 = 32000(0x7d00, float:4.4842E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r5)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r2 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r6)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r3 = 22050(0x5622, float:3.0899E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r7)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r2 = 16000(0x3e80, float:2.2421E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r8)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r3 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r9)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r3 = 11025(0x2b11, float:1.545E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r10)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r3 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r12)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r0.put(r13, r11)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r0.put(r1, r14)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = r17
            r0.put(r1, r15)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r3 = r18
            r0.put(r3, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = 44100(0xac44, float:6.1797E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r4, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = 32000(0x7d00, float:4.4842E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r5, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r6, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = 22050(0x5622, float:3.0899E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r7, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r8, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r9, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = 11025(0x2b11, float:1.545E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r10, r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            r1 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r12, r1)
            return
    }

    public AACTrackImpl(com.googlecode.mp4parser.DataSource r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "eng"
            r1.<init>(r2, r0)
            return
    }

    public AACTrackImpl(com.googlecode.mp4parser.DataSource r13, java.lang.String r14) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = r13.toString()
            r12.<init>(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r12.trackMetaData = r0
            r12.lang = r14
            r12.dataSource = r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.samples = r0
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r13 = r12.readSamples(r13)
            r12.firstHeader = r13
            int r13 = r13.sampleRate
            double r0 = (double) r13
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r2
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r13 = r12.samples
            int r13 = r13.size()
            double r2 = (double) r13
            double r2 = r2 / r0
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r4 = r12.samples
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L3a:
            boolean r7 = r4.hasNext()
            r8 = 0
            if (r7 != 0) goto L115
            r0 = 8
            long r5 = r5 * r0
            double r0 = (double) r5
            double r0 = r0 / r2
            int r13 = (int) r0
            long r0 = (long) r13
            r12.avgBitRate = r0
            r13 = 1536(0x600, float:2.152E-42)
            r12.bufferSizeDB = r13
            com.coremedia.iso.boxes.SampleDescriptionBox r13 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r13.<init>()
            r12.sampleDescriptionBox = r13
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r13 = new com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            java.lang.String r0 = "mp4a"
            r13.<init>(r0)
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r0 = r12.firstHeader
            int r0 = r0.channelconfig
            r1 = 7
            if (r0 != r1) goto L6a
            r0 = 8
            r13.setChannelCount(r0)
            goto L6d
        L6a:
            r13.setChannelCount(r0)
        L6d:
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r0 = r12.firstHeader
            int r0 = r0.sampleRate
            long r0 = (long) r0
            r13.setSampleRate(r0)
            r0 = 1
            r13.setDataReferenceIndex(r0)
            r0 = 16
            r13.setSampleSize(r0)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r0 = new com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox
            r0.<init>()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor
            r1.<init>()
            r1.setEsId(r8)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor
            r2.<init>()
            r3 = 2
            r2.setPredefined(r3)
            r1.setSlConfigDescriptor(r2)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor
            r2.<init>()
            r4 = 64
            r2.setObjectTypeIndication(r4)
            r4 = 5
            r2.setStreamType(r4)
            int r4 = r12.bufferSizeDB
            r2.setBufferSizeDB(r4)
            long r4 = r12.maxBitRate
            r2.setMaxBitRate(r4)
            long r4 = r12.avgBitRate
            r2.setAvgBitRate(r4)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig r4 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig
            r4.<init>()
            r4.setOriginalAudioObjectType(r3)
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r3 = r12.firstHeader
            int r3 = r3.sampleFrequencyIndex
            r4.setSamplingFrequencyIndex(r3)
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r3 = r12.firstHeader
            int r3 = r3.channelconfig
            r4.setChannelConfiguration(r3)
            r2.setAudioSpecificInfo(r4)
            r1.setDecoderConfigDescriptor(r2)
            r0.setEsDescriptor(r1)
            r13.addBox(r0)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r12.sampleDescriptionBox
            r0.addBox(r13)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r13.setCreationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r13.setModificationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            r13.setLanguage(r14)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.setVolume(r14)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r14 = r12.firstHeader
            int r14 = r14.sampleRate
            long r0 = (long) r14
            r13.setTimescale(r0)
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r13 = r12.samples
            int r13 = r13.size()
            long[] r13 = new long[r13]
            r12.decTimes = r13
            r0 = 1024(0x400, double:5.06E-321)
            java.util.Arrays.fill(r13, r0)
            return
        L115:
            java.lang.Object r7 = r4.next()
            com.googlecode.mp4parser.authoring.Sample r7 = (com.googlecode.mp4parser.authoring.Sample) r7
            long r9 = r7.getSize()
            int r7 = (int) r9
            long r9 = (long) r7
            long r5 = r5 + r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.add(r7)
        L129:
            int r7 = r13.size()
            double r9 = (double) r7
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 > 0) goto L169
            int r7 = r13.size()
            int r9 = (int) r0
            if (r7 != r9) goto L3a
            java.util.Iterator r7 = r13.iterator()
        L13d:
            boolean r9 = r7.hasNext()
            if (r9 != 0) goto L15d
            r9 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = (double) r8
            double r7 = r7 * r9
            int r9 = r13.size()
            double r9 = (double) r9
            double r7 = r7 / r9
            double r7 = r7 * r0
            long r9 = r12.maxBitRate
            double r9 = (double) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L3a
            int r7 = (int) r7
            long r7 = (long) r7
            r12.maxBitRate = r7
            goto L3a
        L15d:
            java.lang.Object r9 = r7.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r8 = r8 + r9
            goto L13d
        L169:
            r13.pop()
            goto L129
    }

    static /* synthetic */ com.googlecode.mp4parser.DataSource access$0(com.googlecode.mp4parser.authoring.tracks.AACTrackImpl r0) {
            com.googlecode.mp4parser.DataSource r0 = r0.dataSource
            return r0
    }

    private com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.AdtsHeader readADTSHeader(com.googlecode.mp4parser.DataSource r7) throws java.io.IOException {
            r6 = this;
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r0 = new com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader
            r0.<init>(r6)
            r1 = 7
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
        La:
            int r3 = r2.position()
            if (r3 < r1) goto Lb0
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            java.nio.Buffer r2 = r2.rewind()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.<init>(r2)
            r2 = 12
            int r2 = r1.readBits(r2)
            r3 = 4095(0xfff, float:5.738E-42)
            if (r2 != r3) goto La8
            r2 = 1
            int r3 = r1.readBits(r2)
            r0.mpegVersion = r3
            r3 = 2
            int r4 = r1.readBits(r3)
            r0.layer = r4
            int r4 = r1.readBits(r2)
            r0.protectionAbsent = r4
            int r4 = r1.readBits(r3)
            int r4 = r4 + r2
            r0.profile = r4
            r4 = 4
            int r4 = r1.readBits(r4)
            r0.sampleFrequencyIndex = r4
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.samplingFrequencyIndexMap
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.sampleRate = r4
            r1.readBits(r2)
            r4 = 3
            int r4 = r1.readBits(r4)
            r0.channelconfig = r4
            int r4 = r1.readBits(r2)
            r0.original = r4
            int r4 = r1.readBits(r2)
            r0.home = r4
            int r4 = r1.readBits(r2)
            r0.copyrightedStream = r4
            int r4 = r1.readBits(r2)
            r0.copyrightStart = r4
            r4 = 13
            int r4 = r1.readBits(r4)
            r0.frameLength = r4
            r4 = 11
            int r4 = r1.readBits(r4)
            r0.bufferFullness = r4
            int r1 = r1.readBits(r3)
            int r1 = r1 + r2
            r0.numAacFramesPerAdtsFrame = r1
            if (r1 != r2) goto La0
            int r1 = r0.protectionAbsent
            if (r1 != 0) goto L9f
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)
            r7.read(r1)
        L9f:
            return r0
        La0:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "This muxer can only work with 1 AAC frame per ADTS frame"
            r7.<init>(r0)
            throw r7
        La8:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Expected Start Word 0xfff"
            r7.<init>(r0)
            throw r7
        Lb0:
            int r3 = r7.read(r2)
            r4 = -1
            if (r3 != r4) goto La
            r7 = 0
            return r7
    }

    private com.googlecode.mp4parser.authoring.tracks.AACTrackImpl.AdtsHeader readSamples(com.googlecode.mp4parser.DataSource r11) throws java.io.IOException {
            r10 = this;
            r0 = 0
        L1:
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r1 = r10.readADTSHeader(r11)
            if (r1 != 0) goto L8
            return r0
        L8:
            if (r0 != 0) goto Lb
            r0 = r1
        Lb:
            long r4 = r11.position()
            int r2 = r1.frameLength
            int r3 = r1.getSize()
            int r2 = r2 - r3
            long r6 = (long) r2
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r8 = r10.samples
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$1 r9 = new com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$1
            r2 = r9
            r3 = r10
            r2.<init>(r3, r4, r6)
            r8.add(r9)
            long r2 = r11.position()
            int r4 = r1.frameLength
            long r4 = (long) r4
            long r2 = r2 + r4
            int r1 = r1.getSize()
            long r4 = (long) r1
            long r2 = r2 - r4
            r11.position(r2)
            goto L1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "soun"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.sampleDescriptionBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            long[] r0 = r1.decTimes
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AACTrackImpl{sampleRate="
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r1 = r2.firstHeader
            int r1 = r1.sampleRate
            r0.append(r1)
            java.lang.String r1 = ", channelconfig="
            r0.append(r1)
            com.googlecode.mp4parser.authoring.tracks.AACTrackImpl$AdtsHeader r1 = r2.firstHeader
            int r1 = r1.channelconfig
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
