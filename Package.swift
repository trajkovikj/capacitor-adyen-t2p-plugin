// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorAdyenT2pPlugin",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "CapacitorAdyenT2pPlugin",
            targets: ["AdyenT2PPluginPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "AdyenT2PPluginPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/AdyenT2PPluginPlugin"),
        .testTarget(
            name: "AdyenT2PPluginPluginTests",
            dependencies: ["AdyenT2PPluginPlugin"],
            path: "ios/Tests/AdyenT2PPluginPluginTests")
    ]
)