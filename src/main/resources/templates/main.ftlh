<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

    <style>
        ul {
            list-style-type: none;
            padding: 0 !important;
        }
    </style>
</head>

<body>

<div class="container">
    <div class="row alert alert-primary">
        <div class="col-sm">
            Message: ${message}
        </div>
    </div>

    <#if time??>
        <div class="row alert alert-primary">
            <div class="col-sm">
                Date and Time: ${time}
            </div>
        </div>
    </#if>
</div>

</body>

</html>