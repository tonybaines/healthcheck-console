package healthcheck.console

class HealthcheckStubRatpackApp {
    final Closure routes = {
        get("/health") {
            setHeader("Access-Control-Allow-Origin", "*");
            setHeader("Access-Control-Allow-Headers", "X-Requested-With");
            setHeader("Content-Type", "application/json")
            """{
   "QuoteEngineApplication" :
      {
         "status" : "GREEN",
         "message" : "The database connection is open",
         "timestamp" : "2012-07-06 14:48:50"
      },
   "CustomerInventoryApplication" :
      {
         "status" : "GREEN",
         "message" : "[The database connection is open], [The BIG database is available.]",
         "timestamp" : "2012-07-06 14:48:49"
      },
   "PricingFacadeApplication" :
      {
         "status" : "GREEN",
         "message" : "[The database connection is open], [Service A is up and running], [Service B is up and running]",
         "timestamp" : "2012-07-06 14:48:53"
      },
   "SessionServiceApplication" :
      {
         "status" : "GREEN",
         "message" : "On-line",
         "timestamp" : "2012-07-06 14:48:50"
      },
   "ShallowFacadeApplication" :
      {
         "status" : "RED",
         "message" : "No access to required objects: [].  Non-queryable objects: [BOOKS, AUTHORS].  Fully-available objects: [] as app_user",
         "timestamp" : "2012-07-06 14:48:50"
      },
   "ProjectEngineWebApplication" :
      {
         "status" : "GREEN",
         "message" : "On-line",
         "timestamp" : "2012-07-06 14:48:50"
      },
   "PmrApplication" :
      {
         "status" : "GREEN",
         "message" : "On-line",
         "timestamp" : "2012-07-06 14:48:49"
      }
}"""
        }

        get("/statistics") {
            setHeader("Access-Control-Allow-Origin", "*");
            setHeader("Access-Control-Allow-Headers", "X-Requested-With");
            setHeader("Content-Type", "application/json")
            """{
   "QuoteEngineApplication" :
      {
         "totalRequests" : 19,
         "totalCompletedResponses" : 18,
         "requestStats" :
            [
               {
                  "GET:/projects/[ID]/choices/[ID]/" :
                     {
                        "hits" : 4,
                        "minTime" : 26,
                        "maxTime" : 42,
                        "totalTime" : 136,
                        "meanTime" : 34
                     }
               },
               {
                  "GET:/projects/[ID]/choices/[ID]/offers/" :
                     {
                        "hits" : 1,
                        "minTime" : 201,
                        "maxTime" : 201,
                        "totalTime" : 201,
                        "meanTime" : 201
                     }
               },
               {
                  "GET:/projects/[ID]/" :
                     {
                        "hits" : 3,
                        "minTime" : 3,
                        "maxTime" : 11,
                        "totalTime" : 18,
                        "meanTime" : 6
                     }
               },
               {
                  "GET:/projects/[ID]/choices/[ID]/line-items/" :
                     {
                        "hits" : 4,
                        "minTime" : 791,
                        "maxTime" : 4950,
                        "totalTime" : 7731,
                        "meanTime" : 1932
                     }
               },
               {
                  "GET:/projects/[ID]/choices/[ID]/offers/[ID]/" :
                     {
                        "hits" : 3,
                        "minTime" : 218,
                        "maxTime" : 244,
                        "totalTime" : 694,
                        "meanTime" : 231
                     }
               },
               {
                  "GET:/monitoring/health/" :
                     {
                        "hits" : 1,
                        "minTime" : 3,
                        "maxTime" : 3,
                        "totalTime" : 3,
                        "meanTime" : 3
                     }
               },
               {
                  "GET:/projects/[ID]/choices/" :
                     {
                        "hits" : 1,
                        "minTime" : 325,
                        "maxTime" : 325,
                        "totalTime" : 325,
                        "meanTime" : 325
                     }
               },
               {
                  "GET:/monitoring/information/" :
                     {
                        "hits" : 1,
                        "minTime" : 6,
                        "maxTime" : 6,
                        "totalTime" : 6,
                        "meanTime" : 6
                     }
               }
            ],
         "timestamp" : "2012-07-06 14:50:13"
      },
   "CustomerInventoryApplication" :
      {
         "totalRequests" : 60,
         "totalCompletedResponses" : 59,
         "requestStats" :
            [
               {
                  "GET:/monitoring/health/" :
                     {
                        "hits" : 1,
                        "minTime" : 63,
                        "maxTime" : 63,
                        "totalTime" : 63,
                        "meanTime" : 63
                     }
               },
               {
                  "POST:/app/inventory/validation-reports/" :
                     {
                        "hits" : 20,
                        "minTime" : 2,
                        "maxTime" : 25,
                        "totalTime" : 126,
                        "meanTime" : 6
                     }
               },
               {
                  "GET:/monitoring/information/" :
                     {
                        "hits" : 1,
                        "minTime" : 8,
                        "maxTime" : 8,
                        "totalTime" : 8,
                        "meanTime" : 8
                     }
               },
               {
                  "GET:/app/inventory/options/[ID]/future-assets/" :
                     {
                        "hits" : 37,
                        "minTime" : 9,
                        "maxTime" : 151,
                        "totalTime" : 1220,
                        "meanTime" : 32
                     }
               }
            ],
         "timestamp" : "2012-07-06 14:50:13"
      },
   "PricingFacadeApplication" :
      {
         "totalRequests" : 3,
         "totalCompletedResponses" : 2,
         "requestStats" :
            [
               {
                  "GET:/monitoring/health/" :
                     {
                        "hits" : 1,
                        "minTime" : 2817,
                        "maxTime" : 2817,
                        "totalTime" : 2817,
                        "meanTime" : 2817
                     }
               },
               {
                  "GET:/monitoring/information/" :
                     {
                        "hits" : 1,
                        "minTime" : 6,
                        "maxTime" : 6,
                        "totalTime" : 6,
                        "meanTime" : 6
                     }
               }
            ],
         "timestamp" : "2012-07-06 14:50:13"
      },
   "SessionServiceApplication" :
      {
         "totalRequests" : 28,
         "totalCompletedResponses" : 27,
         "requestStats" :
            [
               {
                  "GET:/app/permissions/customers/[ID]/" :
                     {
                        "hits" : 12,
                        "minTime" : 60,
                        "maxTime" : 183,
                        "totalTime" : 1284,
                        "meanTime" : 107
                     }
               },
               {
                  "GET:/app/sessions/user-contexts/DIRECT_USER/" :
                     {
                        "hits" : 12,
                        "minTime" : 1,
                        "maxTime" : 18,
                        "totalTime" : 54,
                        "meanTime" : 4
                     }
               },
               {
                  "POST:/app/sessions/user-contexts/" :
                     {
                        "hits" : 1,
                        "minTime" : 404,
                        "maxTime" : 404,
                        "totalTime" : 404,
                        "meanTime" : 404
                     }
               },
               {
                  "GET:/monitoring/health/" :
                     {
                        "hits" : 1,
                        "minTime" : 2,
                        "maxTime" : 2,
                        "totalTime" : 2,
                        "meanTime" : 2
                     }
               },
               {
                  "GET:/monitoring/information/" :
                     {
                        "hits" : 1,
                        "minTime" : 5,
                        "maxTime" : 5,
                        "totalTime" : 5,
                        "meanTime" : 5
                     }
               }
            ],
         "timestamp" : "2012-07-06 14:50:13"
      },
   "ShallowFacadeApplication" :
      {
         "totalRequests" : 25,
         "totalCompletedResponses" : 24,
         "requestStats" :
            [
               {
                  "GET:/service/customers/[ID]/" :
                     {
                        "hits" : 14,
                        "minTime" : 2,
                        "maxTime" : 75,
                        "totalTime" : 136,
                        "meanTime" : 9
                     }
               },
               {
                  "GET:/service/customers/[ID]/sites/[ID]/" :
                     {
                        "hits" : 2,
                        "minTime" : 5,
                        "maxTime" : 55,
                        "totalTime" : 60,
                        "meanTime" : 30
                     }
               },
               {
                  "GET:/service/customers/[ID]/sites/" :
                     {
                        "hits" : 1,
                        "minTime" : 50,
                        "maxTime" : 50,
                        "totalTime" : 50,
                        "meanTime" : 50
                     }
               },
               {
                  "GET:/service/projects/[ID]/" :
                     {
                        "hits" : 5,
                        "minTime" : 5,
                        "maxTime" : 85,
                        "totalTime" : 111,
                        "meanTime" : 22
                     }
               },
               {
                  "GET:/monitoring/health/" :
                     {
                        "hits" : 1,
                        "minTime" : 93,
                        "maxTime" : 93,
                        "totalTime" : 93,
                        "meanTime" : 93
                     }
               },
               {
                  "GET:/monitoring/information/" :
                     {
                        "hits" : 1,
                        "minTime" : 4,
                        "maxTime" : 4,
                        "totalTime" : 4,
                        "meanTime" : 4
                     }
               }
            ],
         "timestamp" : "2012-07-06 14:50:13"
      },
   "ProjectEngineWebApplication" :
      {
         "totalRequests" : 15,
         "totalCompletedResponses" : 14,
         "requestStats" :
            [
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/offers/[ID]/" :
                     {
                        "hits" : 1,
                        "minTime" : 848,
                        "maxTime" : 848,
                        "totalTime" : 848,
                        "meanTime" : 848
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/details-tab/" :
                     {
                        "hits" : 1,
                        "minTime" : 868,
                        "maxTime" : 868,
                        "totalTime" : 868,
                        "meanTime" : 868
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/line-items/" :
                     {
                        "hits" : 1,
                        "minTime" : 6693,
                        "maxTime" : 6693,
                        "totalTime" : 6693,
                        "meanTime" : 6693
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/" :
                     {
                        "hits" : 1,
                        "minTime" : 1120,
                        "maxTime" : 1120,
                        "totalTime" : 1120,
                        "meanTime" : 1120
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/offers/" :
                     {
                        "hits" : 1,
                        "minTime" : 537,
                        "maxTime" : 537,
                        "totalTime" : 537,
                        "meanTime" : 537
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/product-prices/" :
                     {
                        "hits" : 1,
                        "minTime" : 1872,
                        "maxTime" : 1872,
                        "totalTime" : 1872,
                        "meanTime" : 1872
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/product-price-summary/" :
                     {
                        "hits" : 1,
                        "minTime" : 1814,
                        "maxTime" : 1814,
                        "totalTime" : 1814,
                        "meanTime" : 1814
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/pricing-tab/" :
                     {
                        "hits" : 1,
                        "minTime" : 2519,
                        "maxTime" : 2519,
                        "totalTime" : 2519,
                        "meanTime" : 2519
                     }
               },
               {
                  "GET:/monitoring/health/" :
                     {
                        "hits" : 1,
                        "minTime" : 2,
                        "maxTime" : 2,
                        "totalTime" : 2,
                        "meanTime" : 2
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/offers/[ID]/offer-details/" :
                     {
                        "hits" : 1,
                        "minTime" : 772,
                        "maxTime" : 772,
                        "totalTime" : 772,
                        "meanTime" : 772
                     }
               },
               {
                  "GET:/monitoring/information/" :
                     {
                        "hits" : 1,
                        "minTime" : 16,
                        "maxTime" : 16,
                        "totalTime" : 16,
                        "meanTime" : 16
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/offers/[ID]/offer-details-tab/" :
                     {
                        "hits" : 1,
                        "minTime" : 805,
                        "maxTime" : 805,
                        "totalTime" : 805,
                        "meanTime" : 805
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices/[ID]/" :
                     {
                        "hits" : 1,
                        "minTime" : 528,
                        "maxTime" : 528,
                        "totalTime" : 528,
                        "meanTime" : 528
                     }
               },
               {
                  "GET:/app/customers/[ID]/projects/[ID]/choices-tab/" :
                     {
                        "hits" : 1,
                        "minTime" : 807,
                        "maxTime" : 807,
                        "totalTime" : 807,
                        "meanTime" : 807
                     }
               }
            ],
         "timestamp" : "2012-07-06 14:50:13"
      },
   "PmrApplication" :
      {
         "totalRequests" : 34,
         "totalCompletedResponses" : 33,
         "requestStats" :
            [
               {
                  "GET:/pmr/catalogue/" :
                     {
                        "hits" : 2,
                        "minTime" : 1,
                        "maxTime" : 10,
                        "totalTime" : 11,
                        "meanTime" : 5
                     }
               },
               {
                  "GET:/pmr/products/[ID]/versions/TODO-latest-version/" :
                     {
                        "hits" : 12,
                        "minTime" : 6,
                        "maxTime" : 220,
                        "totalTime" : 778,
                        "meanTime" : 64
                     }
               },
               {
                  "GET:/pmr/products/SConAccSteelhead/versions/TODO-latest-version/" :
                     {
                        "hits" : 1,
                        "minTime" : 448,
                        "maxTime" : 448,
                        "totalTime" : 448,
                        "meanTime" : 448
                     }
               },
               {
                  "GET:/pmr/lookup/ServiceA SUPPLIER NAME/" :
                     {
                        "hits" : 1,
                        "minTime" : 1,
                        "maxTime" : 1,
                        "totalTime" : 1,
                        "meanTime" : 1
                     }
               },
               {
                  "GET:/pmr/lookup/ServiceAInstallerName/" :
                     {
                        "hits" : 1,
                        "minTime" : 4,
                        "maxTime" : 4,
                        "totalTime" : 4,
                        "meanTime" : 4
                     }
               },
               {
                  "GET:/pmr/lookup/ServiceAMaintainerName/" :
                     {
                        "hits" : 1,
                        "minTime" : 0,
                        "maxTime" : 0,
                        "totalTime" : 0,
                        "meanTime" : 0
                     }
               },
               {
                  "GET:/pmr/products/SIPCGatewayConfig/versions/TODO-latest-version/" :
                     {
                        "hits" : 2,
                        "minTime" : 8,
                        "maxTime" : 28,
                        "totalTime" : 36,
                        "meanTime" : 18
                     }
               },
               {
                  "GET:/pmr/lookup/MAINTENANCE OPTION/" :
                     {
                        "hits" : 1,
                        "minTime" : 0,
                        "maxTime" : 0,
                        "totalTime" : 0,
                        "meanTime" : 0
                     }
               },
               {
                  "GET:/pmr/lookup/ServiceACallOffAgent/" :
                     {
                        "hits" : 1,
                        "minTime" : 0,
                        "maxTime" : 0,
                        "totalTime" : 0,
                        "meanTime" : 0
                     }
               },
               {
                  "GET:/pmr/products/SVCMC/versions/TODO-latest-version/" :
                     {
                        "hits" : 1,
                        "minTime" : 156,
                        "maxTime" : 156,
                        "totalTime" : 156,
                        "meanTime" : 156
                     }
               },
               {
                  "GET:/pmr/products/SConAccOffnet/versions/TODO-latest-version/" :
                     {
                        "hits" : 1,
                        "minTime" : 96,
                        "maxTime" : 96,
                        "totalTime" : 96,
                        "meanTime" : 96
                     }
               },
               {
                  "GET:/pmr/lookup/INSTALLATION HOURS/" :
                     {
                        "hits" : 1,
                        "minTime" : 1,
                        "maxTime" : 1,
                        "totalTime" : 1,
                        "meanTime" : 1
                     }
               },
               {
                  "GET:/pmr/lookup/ROUTER NAME/" :
                     {
                        "hits" : 1,
                        "minTime" : 0,
                        "maxTime" : 0,
                        "totalTime" : 0,
                        "meanTime" : 0
                     }
               },
               {
                  "GET:/monitoring/health/" :
                     {
                        "hits" : 1,
                        "minTime" : 14,
                        "maxTime" : 14,
                        "totalTime" : 14,
                        "meanTime" : 14
                     }
               },
               {
                  "GET:/monitoring/information/" :
                     {
                        "hits" : 1,
                        "minTime" : 16,
                        "maxTime" : 16,
                        "totalTime" : 16,
                        "meanTime" : 16
                     }
               },
               {
                  "GET:/pmr/products/SConAccSteelheadCard/versions/TODO-latest-version/" :
                     {
                        "hits" : 1,
                        "minTime" : 73,
                        "maxTime" : 73,
                        "totalTime" : 73,
                        "meanTime" : 73
                     }
               },
               {
                  "GET:/pmr/lookup/SITE SURVEY/" :
                     {
                        "hits" : 1,
                        "minTime" : 0,
                        "maxTime" : 0,
                        "totalTime" : 0,
                        "meanTime" : 0
                     }
               },
               {
                  "GET:/pmr/products/SIVPNStub/versions/TODO-latest-version/" :
                     {
                        "hits" : 2,
                        "minTime" : 39,
                        "maxTime" : 73,
                        "totalTime" : 112,
                        "meanTime" : 56
                     }
               },
               {
                  "GET:/pmr/products/SConAcc/versions/TODO-latest-version/" :
                     {
                        "hits" : 1,
                        "minTime" : 18,
                        "maxTime" : 18,
                        "totalTime" : 18,
                        "meanTime" : 18
                     }
               }
            ],
         "timestamp" : "2012-07-06 14:50:12"
      }
}"""
        }

        get("/information") {
            setHeader("Access-Control-Allow-Origin", "*");
            setHeader("Access-Control-Allow-Headers", "X-Requested-With");
            setHeader("Content-Type", "application/json")
            """{
   "QuoteEngineApplication" :
      {
         "componentName" : "QuoteEngine",
         "componentVersion" : "1.3.0-SNAPSHOT:https://subversion/svn/app/app/trunk@r5122:2012-07-05T17:30:17-BST",
         "componentProperties" :
            [
               {
                  "dbdeploy-changelog-number" : "Changelog revision 26 applied on 2012-06-05 06:15:31.57"
               }
            ],
         "timestamp" : "2012-07-06 14:49:55"
      },
   "CustomerInventoryApplication" :
      {
         "componentName" : "CustomerInventory",
         "componentVersion" : "1.3.0-SNAPSHOT:https://subversion/svn/app/app/trunk@r5122:2012-07-05T17:30:22-BST",
         "componentProperties" :
            [
               {
                  "dbdeploy-changelog-number" : "Changelog revision 43 applied on 2012-07-02 05:57:34.86"
               }
            ],
         "timestamp" : "2012-07-06 14:49:55"
      },
   "PricingFacadeApplication" :
      {
         "componentName" : "PricingFacade",
         "componentVersion" : "1.3.0-SNAPSHOT:https://subversion/svn/app/app/trunk@r5122:2012-07-05T17:30:25-BST",
         "componentProperties" :
            [
               {
                  "dbdeploy-changelog-number" : "Changelog revision 12 applied on 2012-06-29 09:41:49.991"
               }
            ],
         "timestamp" : "2012-07-06 14:49:56"
      },
   "SessionServiceApplication" :
      {
         "componentName" : "SessionService",
         "componentVersion" : "1.3.0-SNAPSHOT:https://subversion/svn/app/app/trunk@r5122:2012-07-05T17:30:24-BST",
         "componentProperties" :
            [
               {
                  "active-sessions-count" : "0"
               }
            ],
         "timestamp" : "2012-07-06 14:49:56"
      },
   "ShallowFacadeApplication" :
      {
         "componentName" : "ShallowFacade",
         "componentVersion" : "1.3.0-SNAPSHOT:https://subversion/svn/app/app/trunk@r5122:2012-07-05T17:30:23-BST",
         "componentProperties" :
            [
            ],
         "timestamp" : "2012-07-06 14:49:55"
      },
   "ProjectEngineWebApplication" :
      {
         "componentName" : "ProjectEngineWeb",
         "componentVersion" : "1.3.0-SNAPSHOT:https://subversion/svn/app/app/trunk@r5122:2012-07-05T17:30:17-BST",
         "componentProperties" :
            [
            ],
         "timestamp" : "2012-07-06 14:49:56"
      },
   "PmrApplication" :
      {
         "componentName" : "Pmr",
         "componentVersion" : "1.3.0-SNAPSHOT:https://subversion/svn/app/app/trunk@r5122:2012-07-05T17:30:24-BST",
         "componentProperties" :
            [
            ],
         "timestamp" : "2012-07-06 14:49:55"
      }
}"""
        }
    }
}
